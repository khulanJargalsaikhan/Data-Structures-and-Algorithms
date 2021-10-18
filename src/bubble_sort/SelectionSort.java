package bubble_sort;

import java.util.Arrays;

public class SelectionSort {
	
	//helper swap method
	static void swap(int[] arr, int i, int j) {
		if(i==j)
			return;
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;	
	}
	
	static int[] selectionSort(int[] arr) {
		
		for(int lastUnsortedIndex = arr.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			int largest = 0;
			
			for(int i=1; i<=lastUnsortedIndex; i++) {
				if(arr[i] > arr[largest])
					largest = i;
			}
			
		swap(arr, largest, lastUnsortedIndex);	
		}
		
		return arr;
	}
	
	
	

	public static void main(String[] args) {

		System.out.println(Arrays.toString(selectionSort(new int[] {20, 35, -15, 7, 55, 1, -22})));
		System.out.println(Arrays.toString(selectionSort(new int[] {55, -8, 0, -1, 47, 20, 11})));

		
		// Time complexity is O(n*n)
	}

}
