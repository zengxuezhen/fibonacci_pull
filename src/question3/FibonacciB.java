package question3;

import java.util.Scanner;

public class FibonacciB {
	private static long getFibo(long i) {
		
		  if (i == 1)
			  return 0;
		  else if(i==2)
			  return  1;
		  else
			  return getFibo(i - 1) + getFibo(i - 2);
	}
		 
		 public static void main(String[] args) {
			 
			 System.out.println("Please enter how many numbers you want to calculate: ");
			 System.out.println("Warning: better do not enter a number great than 50, or your application might be crush!!!");
			 Scanner scanner=new Scanner(System.in);
			 int n=scanner.nextInt();
			 for (int j = 1; j <= n; j++) {
				 System.out.print(getFibo(j) + "	");
				 if (j % 10 == 0) 
					 System.out.println();
		   
			 }
			 
			 scanner.close();
		 }
		
}
