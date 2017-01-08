package question3;

import java.util.Scanner;

public class FibonacciA {
	public static void main(String[] args) {
		  long a=0, b=1, c=0;
		  System.out.println("Please enter how many numbesr u want to calculate(should great than 2): ");
		  Scanner scanner=new Scanner(System.in);
		  int n=scanner.nextInt();
		  System.out.print(a + "	" + b + "	");
		  for (int i = 1; i <= n-2	; i++) {
			  c = a + b;
			  a = b;
			  b = c;
			  System.out.print(c + "	");
			  if ((i+2) % 10 == 0) 
					 System.out.println();
		  }
		  scanner.close();
	}
}

