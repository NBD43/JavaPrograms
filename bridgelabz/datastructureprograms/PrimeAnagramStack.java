/******************************************************************************
 * 
 *  
 *  Purpose: To stored primeAnagram numbers 1-1000 in 2D Array using Stack.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   28-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructureprograms;

import com.bridgelabz.datastructure.Stack;
import com.bridgelabz.datastructure.Utility;

public class PrimeAnagramStack {

	public static void main(String[] args) {
		System.out.println("printing PRIME+ ANAGRAM+ BY USING STACK");
		int range=1000;
		int []arr=Utility.primeAnagram(range);
		Stack<Integer> st=new Stack<Integer>();
		for(int i=0;i<arr.length;i++) {
			st.push(arr[i]);
		}
		st.display();
		System.out.println("Reverse PRIME+ANAGRAM :");
		while(st.isEmpty()!=true) {
			System.out.print(st.pop()+"  ");
		}

	}

}
