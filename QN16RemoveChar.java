package java_hackathan;

import java.util.Scanner;

public class QN16RemoveChar {

	public static void main(String[] args) {
		// Q16. Write a method that will remove given character from the String?
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Type your words here");
		String inputString = scan.nextLine();
		
		
		System.out.println("Enter a character to remove from the string:");
		char charToRemove = scan.next().charAt(0);
		
		String result = removeCharacter(inputString, charToRemove);
		System.out.println("String after removing " + charToRemove + " : " +result);
		
		
		
		
		scan.close();

	}

	private static String removeCharacter(String inputString, char charToRemove) {
		
		StringBuilder result = new StringBuilder();
		
		for (char ch : inputString.toCharArray()) {
			if (ch != charToRemove) {
				result.append(ch);
			}
		}
		
		
		return result.toString();
	}

}
