package java_hackathan;

import java.util.Scanner;

public class Q29MergSort {

	public static void main(String[] args) {
		// Q29. WJP to perform Merge sort using recursion 
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of elements: ");
	    int n = scan.nextInt();
	    
	    int [] array = new int[n];
	    System.out.println("Enter "+n+" elements");
	    
	    for (int i = 0; i < n; i++) {
	    	array[i] = scan.nextInt();
	    	
	    }
	    mergeSort(array, 0, n - 1);
	    
	    System.out.println("Sorted array in ascending order:");
	    for (int num : array) {
	    	System.out.print(num + " ");
	    	
	    }
		
	    scan.close();   

	}

	public static void mergeSort(int[] array, int left, int right) {
		if(left < right) {
			int mid = (left + right) / 2;
			
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);
			
			merge(array, left, mid, right);
		}
		
		
		
	}

	public static void merge(int[] array, int left, int mid, int right) {
		// TODO Auto-generated method stub
		
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		int [] leftArray = new int[n1];
		int [] rightArray = new int[n2];
		
		for (int i = 0; i< n1; i++) {
			leftArray[i] = array[left + i];
			
		}
		
		int i = 0, j = 0;
		int k = left;
		
		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
				
			}else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
			
		}
		while (i < n1) {
			array[k] = leftArray[i];
			i++;
			k++;
		}
		while (j < n2) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
		
		
	}

}
