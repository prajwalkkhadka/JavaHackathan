package java_hackathan;

import java.util.Scanner;

public class Q30LongestPalindrome {

	public static void main(String[] args) {
		// Q30. Write a function to find out longest palindrome in a given string?
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your word: ");
			String input = scan.nextLine();
			
			String longestPalindrome = findLongestPalindrome(input);
			System.out.println("Longest palindrome in the given string: " + longestPalindrome);
			
			scan.close();
	}
	

	private static String findLongestPalindrome(String input) {
		if (input ==null || input.length() < 2) {
			return input;
		}
		String longestPalindrome = "";
		for (int i = 0; i < input.length(); i++) {
			String palindrome1 = expandAroundCenter(input, i, i);
			String palindrome2 = expandAroundCenter(input, i, i + 1);
			if (palindrome1.length() > longestPalindrome.length()) {
				longestPalindrome = palindrome1;
			}
			if (palindrome2.length() > longestPalindrome.length()) {
				longestPalindrome = palindrome2;
			}
		}
		return longestPalindrome;
	}


	private static String expandAroundCenter(String input, int left, int right) {
		while (left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)) {
			left--;
			right++;
		}
		return input.substring(left +1, right);
	}

}
