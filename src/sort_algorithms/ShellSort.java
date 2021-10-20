package sort_algorithms;

import java.util.Arrays;

public class ShellSort {

	static int[] shellSort(int[] arr) {

		for(int gap = arr.length / 2; gap > 0; gap = gap / 2) {
			
			for(int i = gap; i < arr.length; i++) {
				
				int newElement = arr[i];
				int j = i;
				
				while(j >= gap && arr[j - gap] > newElement) {
					
					arr[j] = arr[j - gap];
					j = j - gap;
				}
				
				arr[j] = newElement;
				
			}
		}

		return arr;

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Arrays.toString(shellSort(new int[] {20, 35, -15, 7, 55, 1, -22})));
		System.out.println(Arrays.toString(shellSort(new int[] {55, -8, 0, -1, 47, 20, 11})));

		
		// Time complexity is O(n*n)

	}

}
