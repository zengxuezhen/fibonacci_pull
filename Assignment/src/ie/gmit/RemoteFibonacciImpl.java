package ie.gmit;
import java.rmi.*;
import java.rmi.server.*;



public class RemoteFibonacciImpl extends UnicastRemoteObject implements RemoteFibonacci {


	private static final long serialVersionUID = 1L;

	protected RemoteFibonacciImpl() throws RemoteException {
		super();
	}

	public String getFibonacciSequence(int parameter) throws RemoteException {
		int i;
		long x=1,y=0,z=0;
		StringBuffer fib =   new StringBuffer("");
		if(parameter<2){
			fib.append(y);
		}
		else if (parameter<3){
			fib.append(y);
			fib.append(",");
			fib.append(x);
		}
		else{
			fib.append(y);
			fib.append(",");
			fib.append(x);
			fib.append(",");
			for (i=0;i<parameter-3;i++)
			{
				z=x+y;
				y=x;
				x=z;
				fib.append(z);
				fib.append(",");
			}
			fib.append(z);
		}
		return fib.toString();
	}

	
}
