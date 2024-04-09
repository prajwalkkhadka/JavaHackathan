package java_hackathan;

import java.util.Arrays;
import java.util.Scanner;

public class Qn26Merge {

	public static void main(String[] args) {
		/* Q26. WJP to merge two sorted array.(Do not use third array)		
		 * array1[10] = 1,2,4,6,9,10		array2[4] =  3, 5,7,8		
		 * After merge :  array1[10] = 1,2,3,4,5,6,7,8,9,10
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array1;");
		int size1 = scan.nextInt();
		
		System.out.println("Enter size of array2:");
		int size2 = scan.nextInt();
		
		int[] array1 = new int[size1+size2];
		int[] array2 = new int[size2];
		
		System.out.println("Enter  "+size1+" sorted elements of Array1:");
		for(int i=0; i<size1; i++) {
			array1[i] = scan.nextInt();
			
		}
		System.out.println("Enter "+size2+" sorted elements of Array2:");
		for(int i=0; i<size2; i++)
		{
			array2[i] = scan.nextInt();
		}
		mergeArrays(array1, size1, array2, size2);

	}

	private static void mergeArrays(int[] a1, int size1, int[] a2, int size2) {
		int j = 0;
		for(int i=size1; i<=(size1+size2-1); i++) {
			//Object[] a1 = null;
			//Object[] a2 = null;
			a1[i]=a2[j];
			j++;
		}
		
		Arrays.sort(a1);
		System.out.println("Sorted arrays:" +Arrays.toString(a1));
		
		
	}

}
