package java_hackathan;

import java.util.Scanner;

public class ConvertStringtoIntQN21 {

	public static void main(String[] args) {
		// Q21. WJP to convert string to int

		
		try (Scanner read = new Scanner(System.in)) {
			System.out.println("Please enter a number(string); ");
			
			String str1 = read.nextLine();
			
			int result = Integer.parseInt(str1);
			
			System.out.printf("The integer value is: %d", result);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.printf("\n");
		
		

	}

}



