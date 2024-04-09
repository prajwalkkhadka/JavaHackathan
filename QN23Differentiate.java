package java_hackathan;

import java.util.Scanner;

public class QN23Differentiate {

	public static void main(String[] args) {
		// Q23. WJP to differentiate input as string, int or bool
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Type input: ");
			String input = scan.nextLine();
			
			if(isInteger(input)) {
				System.out.println("Input is an integer");
				
			} else if (isBoolean(input)) {
				System.out.println("Input is a boolean");
			}else {
				System.out.println("Input is a string");
				
			}
			scan.close();
	}

	private static boolean isInteger(String input) {
		try {
			Integer.parseInt(input);
					return true;
		}catch (NumberFormatException e) {
			
		return false;
	}
	}
	
	private static boolean isBoolean(String input) {
		return input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false");
	}
}
