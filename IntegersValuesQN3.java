package java_hackathan;

import java.util.Arrays;
import java.util.Scanner;

public class IntegersValuesQN3 {

	public static void main(String[] args) {
		// Q3.	Given an array of integers, sort the integer values. 

	   Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the size of the array: ");
		int size =sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the ekements of the array: ");
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		Arrays.sort(arr);
		
		System.out.println("Sorted array: ");
		for(int num : arr) {
			System.out.print(num + " ");
			
			sc.close();
		}

}
}