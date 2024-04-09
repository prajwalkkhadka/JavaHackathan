package java_hackathan;

import java.util.Scanner;

public class Q22InttoString {

	public static void main(String[] args) {
		// Q22. WJP to convert int to string
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter int value: ");
		int num = scan.nextInt();
		
		String strNum = String.valueOf(num);
		
		System.out.println("Your String value is: " +strNum);
		
		scan.close();
		

	}

}
