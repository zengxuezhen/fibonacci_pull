package question1;

import java.util.Scanner;

public class MegerSort {
	//merge 2 sorted array a[first...mid] and a[mid...last]  
	static void mergearray(int a[], int first, int mid, int last, int temp[])  
	{  
	    int i = first, j = mid + 1;  
	    int m = mid,   n = last;  
	    int k = 0;  
	      
	    while (i <= m && j <= n)  
	    {  
	        if (a[i] <= a[j])  
	            temp[k++] = a[i++];  
	        else  
	            temp[k++] = a[j++];  
	    }  
	      
	    while (i <= m)  
	        temp[k++] = a[i++];  
	      
	    while (j <= n)  
	        temp[k++] = a[j++];  
	      
	    for (i = 0; i < k; i++)  
	        a[first + i] = temp[i];  
	}  
	static void mergesort(int a[], int first, int last, int temp[])  
	{  
	    if (first < last)  
	    {  
	        int mid = (first + last) / 2;  
	        mergesort(a, first, mid, temp);    //sort left side 
	        mergesort(a, mid + 1, last, temp); //sort right side  
	        mergearray(a, first, mid, last, temp); //merge both side 
	    }  
	}  
	public static void MergeSort(int[]inputArray)
	{ int[] temp = new int[ inputArray.length ];
	mergesort(inputArray,0,inputArray.length-1,temp);
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
		
		//int[]inputArray={1,2,6,6,84,1,51,3,1,1,6,1,519,1,51,91,651,91,6,1,91,7,8,8,51,1};
		MergeSort(inputArray);
		for(int i=0;i<inputArray.length;i++){
			System.out.print(inputArray[i]+" ");
		}
		scanner.close();
	}
}
