package java_hackathan;

import java.util.Scanner;

public class QN4Palindrome {

	public static void main(String[] args) {
		// Q4.	Given an array of integers check the Palindrome of the series.
			
			Scanner obj = new Scanner(System.in);
			int size;
			System.out.println("Enter size of array : ");
			size = obj.nextInt();
			
			int arr[]= new int [size];
			
			System.out.println("Enter "+size+" values in array");
			for(int i=0; i<size; i++)
			arr[i]=obj.nextInt();
			
			int i,j;
			for(i=0, j=size-1; i<=j; i++, j--)
			{
				if(arr[i]!=arr[j])
				{
					System.out.println("Array is not pallindrome");
					break;
					
				}
			}
				if(i>j)
					System.out.println("Array is pallindrome");
			
				

	}

}
