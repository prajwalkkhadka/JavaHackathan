package java_hackathan;

public class Q32TwoSortedArrays {

	public static void merge(int[] A, int m, int[] B, int n) {
		// Q32. You are given two sorted arrays, A and B, and A has a large enough buffer at the end to hold B.
		//Write a method to merge B into A in sorted order. 
		
		

		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;

		while (i >=0 && j >= 0) {
			if (A[i] > B[j]) {
				A[k--] = A [i--];
			} else {
				A[k--] = B[j--];
			}
		}
		while (j >= 0) {
		A[k--] = B[j--]; 
	}
	}
		public static void main(String[] args) {
		int[] A = new int[8];
		A[0] = 1;
		A[1] = 3;
		A[2] = 5;
		A[3] = 7;
		
		int [] B = {2, 4, 6, 8};
		
		merge(A, 4, B, 4);
		for (int num : A) {
			System.out.println(num + " ");
		}
		}
		}