package java_hackathan;

import java.util.Arrays;
import java.util.Scanner;

public class Q60Reverse {

	public static void reverse(int[]arr, int k) {
		// Q 60. write an algorithm to reverse first 3 numbers, then next 3 numbers, then next 3 
		//numbers, the number will be  based on var k. Array = [3,2,4,7,0,3,1,5,8, 4]    
	   // k=3       OutPut = [4,2,3,3,0,7,8,5,1,4]
		
		int len = arr.length;
		for(int i=0; i<len; i=i+k) {
			
			int start = i;
			int end = Math.min(i+k-1,  len-1);
			while(start<=end) {
				int temp=arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
		}
	}

}
			public static void main(String[] args) {
				int n = 0, k = 0;
				Scanner sc = new Scanner(System.in);
						System.out.println("Enter length of array");
				n=sc.nextInt();
				int[]a=new int[n];
				System.out.println("Enter array elements: ");
				for(int i=0; i<a.length; i++) {
					a[i]=sc.nextInt();
					
				}
				System.out.println("Enter the number for grouping");
				k=sc.nextInt();
				
				System.out.println("Original array elements are: " +Arrays.toString(a));
				reverse(a,k);
				System.out.println("Array elements after reversing in group: ");
				for(int val:a) {
					System.out.println(val+" ");
				}sc.close();
				
			}
			
				
			}
				
                                  
                        


				