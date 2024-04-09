package java_hackathan;

import java.util.Scanner;

public class QN28FactorialNumber {

	public static void main(String[] args) {
		// Q28. WJP to find factorial of a number using recursion
		 	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number;
		number = sc.nextInt();
		int answer = factorial(number);
		System.out.println("factorial of " + number + " is " + answer);
		
		
	}
	
	static int factorial (int n) {
		   if(n ==1)
			   return 1;
		   return n* factorial(n-1);
		   
	   }
		

	}


