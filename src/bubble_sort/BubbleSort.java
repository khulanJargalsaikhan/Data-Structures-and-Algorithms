package bubble_sort;

import java.util.Arrays;

public class BubbleSort {
	
	static int[] bubbleSort(int[] arr) {
		
		for(int lastUnsortedIndex=arr.length-1; lastUnsortedIndex>0; lastUnsortedIndex--) {
			for(int i=0; i<lastUnsortedIndex; i++) {
				if(arr[i] > arr[i+1])
					swap(arr, i, i+1);
			}
		}	
		return arr;
	}
	
	
	//helper method
	static void swap(int[] arr, int i, int j) {
		if(i == j)
			return;
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;	
	}

	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(bubbleSort(new int[] {20, 35, -15, 7, 55, 1, -22})));
		System.out.println(Arrays.toString(bubbleSort(new int[] {55, -8, 0, -1, 47, 20, 11})));

		
		// Time complexity is O(n*n)
	}

}
