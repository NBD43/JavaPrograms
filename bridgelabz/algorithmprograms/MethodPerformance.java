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

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import com.bridgelabz.utilpackage.Utility;

public class MethodPerformance {
	

	public static void main(String[] args) throws InterruptedException {
		int a[]= {4,5,6,8,2,1,9};
		String []str= {"Tv","Pc","mobile","watch","ipad","Ac","laptop"};
		Utility.getStart();
		int leng=a.length;
		long t1,t2,t3,t4,t5,t6,t7;
		
		t1=System.nanoTime();
		int b=Utility.binarySearch(a, 8, 0, 6);
		System.out.println("value  found at index:"+b);
		
		 t2=System.nanoTime();
		 System.out.println(t2-t1);
		/*
		 * int c= Utility.binarySearch(str, "Ac"); if(c!=-1) {
		 * System.out.println("string is not found"); }else
		 * System.out.println("string is found");
		 */
		 TimeUnit.SECONDS.sleep(5);
		 
		 
		
		t3=System.nanoTime();
		Utility.bubbleSort(a);
		
		t4=System.nanoTime();
		System.out.println(t4-t3);
		
		
		
		
		Utility.bubbleSort(str);
		
		t5=System.currentTimeMillis();
		System.out.println(t5-t4);
		
		
		
		
		Utility.insertionSort(a);
		
		t6=System.currentTimeMillis();
		System.out.println(t6-t5);
		
		
		
		Utility.insertionSort(str);
		t7=System.currentTimeMillis();
		System.out.println(t6-t7);
		
		System.out.println("performance of binery search for string"+(t3-t2));
		System.out.println("performance of bubble sort for integer"+(t4-t3));
		System.out.println("performance of bubble sort for string"+(t5-t4));
		System.out.println("performance of bubble sort for integer"+(t6-t5));
		System.out.println("performance of bubble sort for string"+(t7-t6));

	}

}
