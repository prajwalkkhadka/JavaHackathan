package java_hackathan;

import java.util.*;

public class QN2FactorialNonRecursive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to find the factorial: ");
		int number = scan.nextInt();
		
		if(number<0) {
			System.out.println("Enter the valid number");
		}else {
			int factorial = 1;
			for(int i = 1; i<=number;i++) {
				factorial *=i;
			}
			
			System.out.println("Factorial of " + number + " is: " +factorial);
			
		}
		scan.close();// Q2.	Write a program to find factorial (Non Recursive)
		}
	}


//Q2.	Write a program to find factorial (Non Recursive)