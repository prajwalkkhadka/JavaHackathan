package java_hackathan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QN5DuplicateNumbers {

	public static void main(String[] args) {
		// Q5.Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n = scan.nextInt();
		
		int array[] = new int[n];
		System.out.println("Enter an Array Elements");
		
		for (int i = 0; i<n; i++) {
			array[i]= scan.nextInt();
		}
		HashMap<Integer, Integer> occurrences = new HashMap<>();	
		
		for (int num:array) {
			occurrences.put(num,  occurrences.getOrDefault(num, 0) + 1);			
		}
		
		System.out.println("Unique numbers from the Array: ");
		for (int num : occurrences.keySet()) {
			
			System.out.println("Number: " + num + ", Occurrences: " + occurrences.get(num));
			
		}
		
		
				scan.close();
			}
		


	}


