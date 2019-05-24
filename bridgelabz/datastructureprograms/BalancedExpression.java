package com.bridgelabz.datastructureprograms;

import java.util.Scanner;

import com.bridgelabz.datastructure.Stack;

public class BalancedExpression {
	
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		Stack st=new Stack();
		int opening=0,closing=0;
		System.out.println("Enter the Expression:");
		String str=scn.nextLine();
		
		
		for(int i=0;i<str.length();i++) {
			char current=str.charAt(i);
			if(current=='(' ||current=='{' ||current=='[' ) {
				System.out.println(current);
				st.push(current);
		    }else
			if(current==')' ||current=='}' ||current==']' ) {
				char current1=st.pop();
				System.out.println(current1);
				if((current1=='('&&current==')')||(current1=='{'&&current=='}')||(current1=='['&&current==']')) {
					//System.out.println("true");
					break;
				}
			}
			
			if(st.isEmpty()) {
				System.out.println("True1");
			}else System.out.println("False1");
			
			
		}
		
	
	}
		
}
	


