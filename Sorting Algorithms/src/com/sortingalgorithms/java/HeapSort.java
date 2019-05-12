package com.sortingalgorithms.java;

import java.lang.String;
import java.lang.System;

public class HeapSort {
	
	public static void main(String args[]) {
		
	int[] arr = {22,13,17,11,10,14,12};
	
	HeapSort hs = new HeapSort();
	hs.sort(arr);
	hs.printArray(arr);
}

	public  void sort(int[] arr) {
		
		int len = arr.length;          // TO find the length of the array.
		
		for(int i=len/2-1;i>0;i--)    // i = len/2-1 indicates the index positions of the subtrees. i.e 
		{                             // here total len=7 ; so i = 7/2 - 1 = 3 - 1 = 2; here 2=index positon   
			                          // of parent node of right subTree.   					 
			                      
				heapify(arr,len,i);   // arr = original array , len = length of the array , 
				                     // i = index position of parent node of the right subtree.
		}     
		
		// swap the elements and heapify again.
		
		for(int i=len-1;i>=1;i--)
		{
			
			int temp = arr[0];   // }
			arr[0] = arr[i];     // } ---> for swapping the first and last elements of the array each time.
			arr[i] = temp;       // }
			
			heapify(arr,i,0);
		}
	}

	public void heapify(int[] arr, int n, int i) {  // i = index position of parent node of the right subtree.
		                                            // n = length of the array.
		
		int largest = i;           // index position of parent node.
		int li = 2*i+1;           // here 2*i+1 is  to find the index position of the left child node.
		int ri = 2*i+2;           //  here 2*i+2 is  to find the index position of the right child node.
		
		if(li<n && arr[li]>arr[largest]) //comparing if the left side element is greater than the parent.
		{
			largest = li;                // if true then leftside element becomes parent.
		}
		if(ri<n && arr[ri]>arr[largest]) //comparing if the left side element is greater than the parent.
		{
			largest = ri;                // if true then leftside element becomes parent.
		}
		
		if(largest!=i)                  // if the largest element is not the parent node 
		{
			int temp = arr[i];
			arr[i] = arr[largest];     //swapping the parent and the largest element.
			arr[largest] = temp;     
			
			heapify(arr,n,largest);
		}
	}
	void printArray(int[] arr) {
		
		for(int venkat : arr) {
			
			System.out.println(venkat+" ");
		}
	}
}
