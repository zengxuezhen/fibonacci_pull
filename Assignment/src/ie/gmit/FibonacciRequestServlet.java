package ie.gmit;

import java.io.IOException;
import java.rmi.*;
import java.rmi.registry.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.validator.util.GetAnnotationParameter;
import org.omg.CORBA.PUBLIC_MEMBER;

public class FibonacciRequestServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	FibonacciService fibonacciService;

	public void init() throws ServletException {

		fibonacciService = new FibonacciService();
		try {

			RemoteFibonacci compute = new RemoteFibonacciImpl();
			LocateRegistry.createRegistry(1099);
			Naming.rebind("fibonacci", compute);
			System.out.println("Server Registered");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RemoteFibonacci remoteFibonacci=null;
		String rType=request.getParameter("rType");
		System.out.println("before add");
		
		if (rType.equals("Add")){
			System.out.println("this is add");
			String parameter = request.getParameter("parameter");
			
			int jobNum = fibonacciService.add(Integer.parseInt(parameter));
			System.out.println("jobNum="+jobNum);
			System.out.println("para-----------"+parameter);
			System.out.println(jobNum+"job-------------");
			try {
				remoteFibonacci = (RemoteFibonacci) Naming.lookup("rmi://localhost:1099/fibonacci");
			} catch (NotBoundException e) {
				
				e.printStackTrace();
			}
			String result = remoteFibonacci.getFibonacciSequence(Integer.parseInt(parameter));
			System.out.println("result is "+result);
			fibonacciService.put(jobNum, result);
			//request.setAttribute("jobnum", jobNum);
	
			System.out.println("--------------");
			response.sendRedirect("response.jsp?jobnum="+jobNum);
			//response.sendRedirect("response.jsp");


			}
		
		else if (rType.equals("Poll")){
			System.out.println("This is Poll");
			int jobNo=Integer.parseInt(request.getParameter("jobNum"));
			String fibResult=fibonacciService.getResult(jobNo);
			System.out.println("fib...."+fibResult);
			
			request.setAttribute("fibresult",fibResult);
			request.getRequestDispatcher("result.jsp").forward(request, response);
			
			
			System.out.println("..................");
			//response.sendRedirect("result.jsp?fibresult="+fibResult);
		}
		else{
			int jobNo=Integer.parseInt(request.getParameter("jobNum"));
			response.sendRedirect("response.jsp?jobnumber=" + jobNo);}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
