package java_hackathan;

import java.util.Scanner;

public class Q27QuickSort {

	public static void main(String[] args) {
		// Q27. WJP to perform ascending order Quick sort
			
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of elements:");
		int n = scan.nextInt();
		
		int[] array = new int[n];
		System.out.println("Enter "+n+" elements:");
		
		for (int i=0; i<n; i++) {
			array[i] = scan.nextInt();
			
			
		}

			quickSort(array, 0, n -1);
			System.out.print("Sorted array in ascending order:");
			for(int num : array) {
				System.out.print(num + " ");
			}
			scan.close();
	}

	private static int quickSort(int[] array, int low, int high) {
		
		int pivot = array[high];
		int i = low - 1;
		
		for(int j = low; j<high; j++) {
			if(array[j] <= pivot) {
				i++;
				
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				
				
				
			}
		}
		 
		 int temp = array[i+1];
		 array[i + 1] = array[high];
		 array[high] = temp;
		 
		 return i +1;
		 
				
	}

}
