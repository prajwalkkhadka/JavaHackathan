package java_hackathan;

import java.util.Scanner;

public class QN13Reverseinput {

	public static void main(String[] args) {
		// Q13. Given a string print the reverse of the string.(Input:  Java Code Output: edoC avaJ)
	
		String result="";
		System.out.print("Input String: ");

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		
		for(int i=ch.length-1; i>=0; i--)
		{
			result +=ch[i];
			
		}
			System.out.println("Output String: " +result);
			sc.close();
	}
				
}
