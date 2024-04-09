package java_hackathan;

import java.util.Scanner;

public class QN34plusoperator {

	public static void main(String[] args) {
		// Q34. Write a method to implement *, - , / operations. You should use only the + operator
				
			Scanner read = new Scanner(System.in);
			System.out.println("Enter 2 numbers: ");
			int a = read.nextInt();
			int b = read.nextInt();
			
			subtracktion(a,b);
			multiplication(a,b);
			
			try {
				division(a,b);
			}
			catch(ArithmeticException e) {
				System.out.println(e+" occcured");
				
			}
			read.close();		

	}


	 static void subtracktion(int a, int b) {
		 int sub = 0;
		 sub = a + negate(b);
		 System.out.println("Subtraction=" +sub);
	 }
	  static int negate(int b) {
		 int result = 0;
		 int temp = b < 0 ? 1 : -1;
		 while (b !=0) {
			 b += temp;
			 result +=temp;
		 }
	    return result;
	    
	  }
	    static void multiplication(int a, int b) {
	    	int mul = 0;
	    	int b1 = Math.abs(b);
	    	int a1 = Math.abs(a);
	    	for (int i=0; i<b1; i++) {
	    		mul+=a1;
	    	}
	    	if((a<0 && b>0) || (a>0 && b<0)) {
	    		mul = negate(mul);
	    	}
	    	System.out.println("Multiplication=" +mul);
	    	
	    }
	    		
	 static void division(int x, int y) {
		if (y == 0) {
			throw new ArithmeticException("Divide by zero");
			
		}
		
		int absx = Math.abs(x);
		int absy = Math.abs(y);
		
		int product = 0;
		int result = 0;
		while (product + absy <= absx) {
			product += absy;
			result++;
			if((x> 0 && y > 0) || (x < 0 && y <0)) {
				System.out.println("Division="+result);
				
			}else {
		}
	}

	
	 }
		
	
	}


