package java_hackathan;

import java.util.Scanner;

public class Q1Boolean {

	public static void main(String[] args) {
		// Q1. Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true 
		
		Scanner sc = new Scanner(System.in);
		
		    boolean a;
			boolean b;
			boolean c;
			
		
		System.out.println("Enter first boolean value: ");
		a = sc.nextBoolean();
		
		System.out.println("Enter second boolean value: ");
		b = sc.nextBoolean();
		
		System.out.println("Enter third boolean value: ");
		c = sc.nextBoolean();
		
		
		int trueCount = 0;
		
		if(a) trueCount++;
		if(b) trueCount++;
		if(c) trueCount++;
		
		
		if(trueCount>= 2) {
		
			System.out.println("Two boolean are true");
		
		}
		else {
			System.out.println("Two boolean variables are not true");
		}
		sc.close();
	}

}
