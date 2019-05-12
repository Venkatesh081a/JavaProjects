package com.sortingalgorithms.java; 

import java.lang.String;
import java.lang.System;

public class QuickSortMiddle {
	
	public static void main(String args[]) {
		
		int[] arr = {15,9,7,13,12,16,4,18,11};
		
		int len = arr.length;
		
		QuickSortMiddle qsm = new QuickSortMiddle();
		
		qsm.QuickSortRecursion(arr, 0, len-1);
		
		qsm.PrintArray(arr);
	}

	int partition(int[] arr,int low,int high) {
		
		int pivot = arr[(low+high)/2];
		
		while(low <= high) {
			
			while(arr[low] < pivot) {
				
				low++;
			}
			while(arr[high] > pivot) {
				
				high--;
			}
			if(low <= high) {
				
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				
				low++;
				high--;
				
			}
			
		}
		return low;
		
	}
	
	void QuickSortRecursion(int[] arr, int low,int high) {
		
		int pivotele = partition(arr,low,high);
		
		if(low < pivotele-1 ) {
			
			QuickSortRecursion(arr,low,pivotele-1);
		}
		if(high > pivotele) {
			
			QuickSortRecursion(arr,pivotele,high);
		}
		
	}
	
	void PrintArray(int[] arr) {
		
		for(int venky : arr) {
			
			System.out.println(venky+" ");
		}
	}

	
}
