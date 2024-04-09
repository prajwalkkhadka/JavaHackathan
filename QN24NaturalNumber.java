package java_hackathan;

import java.util.Scanner;

public class QN24NaturalNumber {

	public static void main(String[] args) {
		/* Q24. Write a program which inputs a positive natural number N and prints the possible 
		 * consecutive number combinations, which when added give N.    	
		 * INPUT:  N = 9  	OUTPUT:  4 + 5  		      2 + 3+ 4
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter positive natural number N: ");
		int N = scan.nextInt();
		printQN24NaturalNumber(N);
		scan.close();
	}

	private static void printQN24NaturalNumber(int N) {
		int start = 1;
		int end = 1;
		int sum = 1;
		
		while(start<=N/2) {
			if (sum < N ) {
				end++;
				sum += end;
			}else if(sum > N) {
				sum -= start;
				start++;
				
 			}else {
 				printCombination(start, end);
 				sum-=start;
 				start++;
 			}
		}
			
		
	}

	private static void printCombination(int start, int end) {
         System.out.print(start);
         for(int i = start + 1; i<= end; i++) {
        	 System.out.print(" + " + i);
        	 
         }
         System.out.println();
	}

	}
