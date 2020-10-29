package com.vks.search;

public class BinarySearch {
	
	public void binarySearch(int[] list, int sElement) {
		int first = 0;
		   int last = list.length-1;
		   int middle = (first+last)/2;
		 
		   while (first <= last) {
		      if (list[middle] < sElement)
		         first = middle + 1;    
		      else if (list[middle] == sElement) {
		         System.out.println("Element found at index "+middle);
		         break;
		      }
		      else
		         last = middle - 1;
		 
		      middle = (first + last)/2;
		   }
		   if (first > last)
		      System.out.println("Element Not found in the list.");
		
	}
}
