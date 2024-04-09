package java_hackathan;

import java.util.Scanner;


public class FactorialNonRecursiveQN12 {

	public static void main(String [] args) {
		
		
		Scanner sc = new Scanner(System.in);
				
				System.out.print("Enter a number to Calculate Factorial: ");
		
		int num = sc.nextInt();
		int fact = 0;
		if(num<=0)
			fact=1;
		else
		{
		
     for(int i=1; i<=num; i++)
    	 fact=fact*1;
     System.out.println("Factorial of "+num+" using non Recursive Method is: " +fact);
     
     sc.close();
    	 
		}
	}

}
