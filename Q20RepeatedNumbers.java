package java_hackathan;

import java.util.Scanner;

public class Q20RepeatedNumbers {

	public static void main(String[] args) {
		// 
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Type Here");
		String input = scan.nextLine();
		
		int repeatedIntegers = 0;
		int uppercaseCount = 0;
		int lowercaseCount = 0;
		
		for (char c : input.toCharArray()) {
			if (Character.isDigit(c)) {
				repeatedIntegers++;
				
			}else if (Character.isUpperCase(c)) {
				uppercaseCount++;
			}else if (Character.isLowerCase(c)) {
				lowercaseCount++;
			}
		}
		
		System.out.println("Number of repeated Integers: " + repeatedIntegers);
		//String repeatedUppercases = null;
		System.out.println("Number of uppercases: " + uppercaseCount);
		//String repeatedLowercases = null;
		System.out.println("Number of lowercases: " + lowercaseCount);
		
		scan.close();
		
		

	}

}
