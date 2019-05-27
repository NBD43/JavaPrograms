package com.bridgelabz.datastructureprograms;

import java.util.Scanner;

import com.bridgelabz.datastructure.Dequeue;
import com.bridgelabz.datastructure.DequeueFunction;

public class PalindromeChecker {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scn.next();
		DequeueFunction<Character> dequ=new DequeueFunction<Character>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			dequ.addRear(ch);
		}
		
		int flag=0;
		while(dequ.size()>1) {
			if(dequ.removeFront()!=dequ.removeRear()) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}

	}

}
