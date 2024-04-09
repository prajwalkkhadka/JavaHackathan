package java_hackathan;

import java.util.Scanner;

public class QN20RepeatedInt {

	public static void main(String[] args) {
		// Q20. WJP to find total number of repeated integers, uppercase and lowercase character in the give string
		//Not completed yet

		
		   Scanner scan = new Scanner(System.in);
		   System.out.println("Enter a String:");
		   String input = scan.nextLine();
			   
		   int repeatedIntegers = countRepeatedCharacters(input, true);
		   int repeatedUppercase = countRepeatedCharacters(input, false);
		   int repeatedLowercase = countRepeatedCharacters(input.toLowerCase(), false);
		   
		   System.out.println("Total repeated integers: "+ repeatedIntegers);
		   System.out.println("total repeated uppercases:" + repeatedUppercase);
		   System.out.println("total repeated lowercases:" + repeatedLowercase);
		   
		   scan.close();		  

	}

	private static int countRepeatedCharacters(String input, boolean isInteger) {
		int [] counts = new int[256]; 
		int repeatedCount = 0;
		
		for(char c : input.toCharArray()) {
			//boolean isInteger = false;
			if(isInteger && Character.isDigit(c)) {
				counts[c]++;
				if(counts[c]>1) {
					repeatedCount++;
				}
			}else if(!isInteger && Character.isLetter(c)) {
				counts[c]++;
				if(counts[c]>1) {
					repeatedCount++;
					
					
				}
			}
			
		}
		return repeatedCount;
	}

}
