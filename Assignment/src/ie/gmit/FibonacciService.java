package ie.gmit;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

public class FibonacciService {
	
	private LinkedList<FibonacciRequest> inqueue=new LinkedList<FibonacciRequest>();
	  
	  private Map<Integer, String> outqueue=new HashMap<Integer, String>();
	  
	  public int add(int parameter){
		  int random=new Random().nextInt(1000);
		  inqueue.addLast(new FibonacciRequest(random, parameter));
		  return random;
	  }
	  
	  public void put(int jobnumber,String result){
		  outqueue.put(jobnumber, result);
	  }
	  
	  public String getResult(int jobnumber){
		  if(outqueue.containsKey(jobnumber)){
			  String result=outqueue.get(jobnumber);
			  outqueue.remove(jobnumber);
			  return result;
		  }else {
			return null;
		}
	  }

}
