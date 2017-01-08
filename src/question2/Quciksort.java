package question2;

import java.util.Scanner;

public class Quciksort {

	static void quickSort(int input[], int l, int r)  
	{  
	    if (l < r)  
	    {  
	        int i = l, j = r, x = input[l];  
	        while (i < j)  
	        {  
	            while(i < j && input[j] >= x) // from right to left find the first number less than x 
	                j--;    
	            if(i < j)   
	                input[i++] = input[j];  
	              
	            while(i < j && input[i] < x) // from left to right find the first number great than x 
	                i++;    
	            if(i < j)   
	            	input[j--] = input[i];  
	        }  
	        input[i] = x;  
	        quickSort(input, l, i - 1); // recursive call the method 
	        quickSort(input, i + 1, r);  
	    }  
	} 
	public static void main(String[] args) {
		
		System.out.println("Please enter the size of array:");
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		int[] inputArray=new int[size];
		for(int i=0;i<size;i++){
			System.out.print("Please enter the No."+ (i+1) +" number:");			
			inputArray[i]=scanner.nextInt();
			
			
		}
		
		
		quickSort(inputArray,0,size-1);
		System.out.print("Array after quciksort: ");
		for(int i=0;i<inputArray.length;i++){
			System.out.print(inputArray[i]+" ");
		}
		scanner.close();
	}

}
