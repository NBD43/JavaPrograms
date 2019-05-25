/******************************************************************************
 * 
 *  
 *  Purpose: To check the expression is balanced or not.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   25-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructureprograms;

import java.util.Scanner;

import com.bridgelabz.datastructure.Stack;

public class BalancedExpression {
	
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		Stack<Character> st = new Stack<Character>();
		int opening=0,closing=0,third=0;
		System.out.println("Enter the Expression:");
		String str=scn.nextLine();
		
		
		for(int i=0;i<str.length();i++) {
			char current=str.charAt(i);
			//char =st.peek();
			if(current=='{' || current=='('||current=='[') {
				st.push(current);
			}
			char top=st.peek();
			if(current=='}'&& top=='{') {
				st.pop();
			}
			else if(current==')'&& top=='(') {
				st.pop();
			}
			else if(current==']'&& top=='[') {
				st.pop();
			}else break;
		}
		 int count=closing+opening+third;
		if(st.isEmpty()==true && count==0) {
			System.out.println("Balanced");
		}else 
			System.out.println("Unbalanced");
			
			
		
		
	
	}
		
}
	


