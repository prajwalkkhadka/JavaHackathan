package java_hackathan;

import java.util.Scanner;

public class QN6PerformAscending {

	public static void main(String[] args) {
		// Q6.	WJP to perform ascending order Selection  sort
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter the size of the array: ");
			int size = scan.nextInt();
			int[] array = new int[size];
			
			
			
			System.out.println("enter the elements of the array");
			for(int i = 0; i<size; i++) {
				array[i] = scan.nextInt();
				
				
			}
			
			for(int i = 0; i<size -1; i++) {
				int minIndex = i;
				for(int j = i + 1; j<size; j++) {
					if(array[j] <array[minIndex]) {
						minIndex = j;
					}
				}
				int temp = array[minIndex];
				array [minIndex] = array[i];
				array[i] = temp;
				
				
			}
			System.out.println("Sorrted Array in ascending order: ");
			for (int i= 0; i<size; i++) {
				System.out.print(array[i] + " ");
				
			}
			System.out.println();
			scan.close();
			

	}

}
