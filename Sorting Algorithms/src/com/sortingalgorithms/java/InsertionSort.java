package com.sortingalgorithms.java;
import java.lang.String;
import java.lang.System;

public class InsertionSort {
	public static void main(String args[]) {
		
	
//index positions  0 1 2 3 4 5	 	
		int[] a = {9,2,6,7,4,8};	
		
		int j,temp = 0;
		for(int i = 1 ;i < a.length;i++) {   // i = 1, because we have to start from index position 1.
			
			temp = a[i];                     // put the each element  in temp for comparison. 
			 j = i;
			 while(j > 0 && a[j-1] > temp)
			 {                               // j = 0 , because we have to compare till the index position 0;
				 
				 a[j] = a[j-1];              // for swapping the elements. i.e index positions.
				 j = j - 1;                  // decrementing the j value after each comparison.
			 }
			a[j] = temp;                     // shifting the temp after completing the sorting of each element        
		
		}
		
		for(int venky : a) {
			
			System.out.println(venky+" ");
			
		}
	
	}

}
