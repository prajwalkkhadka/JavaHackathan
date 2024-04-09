package java_hackathan;

import java.util.Scanner;

public class QN14ReverseWord {

	public static void main(String[] args) {
		// Q14. Given a string print the reverse of the words string.(Input:  Java Code Output: Code Java
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Type your words here: ");
		String inputString = scan.nextLine();
		
		String[]words = inputString.split("\\s+");
		
		StringBuilder reversedString = new StringBuilder();
		for(int i = words.length - 1; i>= 0; i--) {
			
			reversedString.append(words[i]).append(" ");
			System.out.print("Reversed string: " + reversedString.toString().trim());
			
			scan.close();
		}
		
		

	}

}
