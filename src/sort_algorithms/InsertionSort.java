package sort_algorithms;

import java.util.Arrays;

public class InsertionSort {
	
	static int[] insertionSort(int[] arr) {
		
		for(int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
			
			int newElement = arr[firstUnsortedIndex];
			int i;
			
			for(i = firstUnsortedIndex; i>0 && arr[i-1] > newElement; i--) {
				arr[i] = arr[i-1];
		
			}
		arr[i] = newElement;
			
		}
		
		return arr;
		
	}
	
	
	

	public static void main(String[] args) {
		System.out.println(Arrays.toString(insertionSort(new int[] {20, 35, -15, 7, 55, 1, -22})));
		System.out.println(Arrays.toString(insertionSort(new int[] {55, -8, 0, -1, 47, 20, 11})));

		
		// Time complexity is O(n*n)


	}

}
