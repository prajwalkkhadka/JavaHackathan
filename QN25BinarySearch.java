package java_hackathan;

import java.util.Scanner;

public class QN25BinarySearch {

	public static void main(String[] args) {
		// Q25. Write a program for binary search. And 5 i/p has to take from user as binary elements.
		
		Scanner scan = new Scanner(System.in);
				
		int []binaryArray = new int[5];
		System.out.println("Enter binary elements in sorted order:");
		
		for(int i = 0; i < 5; i++) {
			binaryArray[i]=scan.nextInt();
			if (binaryArray[i] != 0 && binaryArray[i] != 1) {
				System.out.println("Invalid input");
				return;
				
			}
		}
		
		System.out.print("Enter the element");
		int key = scan.nextInt();
		
		int index = binarySearch(binaryArray, key);
		
		if(index != -1) {
			System.out.print("Element " + key + "found at index " +index);
		}else {
			System.out.println("Element" + key + " not found");
			
		}
		scan.close();
		
				

	}

	private static int binarySearch(int[] binaryArray, int key) {
		int left = 0;
		int right = binaryArray.length -1;
		
		while (left<= right) {
			int mid = left + (right = left) /2;
			
			if (binaryArray[mid] == key) {
				return mid;
				
			}
			if (binaryArray[mid]< key) {
				left = mid + 1;
			}else {
				right = mid -1;
				
			}
		}
		
		
		return -1;
	}

}
