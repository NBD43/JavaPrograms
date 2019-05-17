/******************************************************************************
 * 
 *  
 *  Purpose: To print performance of the method with sorted output.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   17-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utilpackage.Utility;

public class MethodPerformance {
	

	public static void main(String[] args) {
		int a[]= {4,5,6,8,2,1,9};
		String []str= {"Tv","Pc","mobile","watch","ipad","Ac","laptop"};
		Utility.getStart();
		int leng=a.length;
		//Utility.getStart();
		//Utility.binarySearch(a, 8, 0, 6);
		//System.out.println("performance of binery search for integer");
		//Utility.elapsedTime();
		
		/*
		 * Utility.getStart(); Utility.binarySearch(str, "Ac");
		 * System.out.println("performance of binery search for string");
		 * Utility.elapsedTime();
		 */
		double start=System.currentTimeMillis();
		Utility.getStart();
		Utility.bubbleSort(a);
		System.out.println("performance of bubble sort for integer");
		double stop=System.currentTimeMillis();
		System.out.println("Elapsed Time:"+(stop-start)/1000);
		Utility.elapsedTime();
		
		Utility.getStart();
		Utility.bubbleSort(str);
		System.out.println("performance of bubble sort for string");
		Utility.elapsedTime();
		
		Utility.getStart();
		Utility.insertionSort(a);
		System.out.println("performance of bubble sort for integer");
		Utility.elapsedTime();
		
		Utility.getStart();
		Utility.insertionSort(str);
		System.out.println("performance of bubble sort for string");
		Utility.elapsedTime();
		

	}

}
