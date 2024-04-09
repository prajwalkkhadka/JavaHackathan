package java_hackathan;

import java.util.Scanner;

public class Q17numberofint {

	public static void main(String[] args) {
		// Q17.  WJP to find total number of integers, uppercase and lowercase character in the give string
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Type your string here: ");
			String inputString = scan.nextLine();
			
			int digitCount = 0;
			int upperCaseCount = 0;
			int lowerCaseCount = 0;
			
			for(char ch : inputString.toCharArray()) {
				if(Character.isDigit(ch)) {
					digitCount++;
				}else if (Character.isUpperCase(ch)) {
					upperCaseCount++;
				}else if (Character.isLowerCase(ch)) {
					lowerCaseCount++;
					
				}
			}
			System.out.println("Total number of intigers: " +digitCount);
			System.out.println("Total number of uppercase characters: " +upperCaseCount);
			System.out.println("Total number of lowercase characters: " +lowerCaseCount);	
			
			scan.close();
}

}
