package com.sortingalgorithms.java;

import java.lang.System;
import java.lang.String;

public class BubbleSort {
	
	public static void main(String args[]) {
		
		int[] a = {36,19,29,12,5};
		
		int temp =0;                           //temporary variable for sorting.
		
		for(int i=0;i<a.length;i++) {          //for loop for number of rounds or passes.
			
			for(int j=0;j<a.length-1-i;j++) 
			{                                  //for loop for adjacent elements.
				
				if(a[j] > a[j+1]) 
				{                              //if condition for comparing the adjacent elements.
					
					temp = a[j];
					a[j] = a[j+1];              //elements are get swapped here.
					a[j+1] = temp;
					
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");        //printing the elements of an array.
		}
		
		
	}

}


