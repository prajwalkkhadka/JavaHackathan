package java_hackathan;

import java.util.Scanner;

public class Q12Palindrome {

	public static void main(String[] args) {
		// Q12. Write a program to check palindrome (MalayalaM) for both numbers and string?
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number or String to check if it is a palindrome or not:");
		String input = sc.nextLine();
		
		if(isPalindrome(input)) {
			System.out.println( "'" + input +  "'is a Palindrome.");
		}else {
			System.out.println("'" + input + "' is not Palindrome.");
			
		}
		sc.close();

	}



	private static boolean isPalindrome(String input) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int j = input.length() -1;
		
		while(i<j) {
			if(input.charAt(i) != input.charAt(j)) {
				return false;
				
			}
			i++;
			j--;
		}
 		
          return true;
	}
}