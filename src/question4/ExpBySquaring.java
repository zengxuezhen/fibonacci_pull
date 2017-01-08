package question4;

import java.util.Scanner;

public class ExpBySquaring {
	static double temp=1;
	public static double expBySquaring(double x, int n) {  
		  
		if(n<0){
			return expBySquaring(1/x, -n);
		}
		if(n==0 &&x!=0){
			return 1;
		}
		if(n==0 && x==0){
			System.out.println("Error!!!");
			System.exit(0);
		}
	    if (n == 1) {  
	        return x * temp;  
	    }  
	    
	      
	    if (n % 2 == 1) {  
	        temp = x;  
	    }  
	  
	    return expBySquaring(x * x, n / 2);  
	  
	}
	
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter the X: ");
		int x=scanner.nextInt();
		System.out.println("please enter the N: ");
		int n=scanner.nextInt();
		
		System.out.println(expBySquaring(x,n));
		scanner.close();
	}
}
