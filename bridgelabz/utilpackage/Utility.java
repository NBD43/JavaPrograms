package com.bridgelabz.utilpackage;

import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Utility {
	public static Scanner sc=new Scanner(System.in);

	

		//to get integer as a input from scanner 
		public static int getInteger() {
			return sc.nextInt();
		}
		
		//to get double as a input from scanner 
		public static double getDouble() {
			return sc.nextDouble();	
		}
			
	
		//to get String as a input from scanner 
		public static String getString() {
			return sc.nextLine();	
		}
		
	
		//to get boolean as a input from scanner 
		public static boolean getBoolean() {
			return sc.nextBoolean();
			
		}
		//to display array on console using printWriter
		public static void toPrintArray(int a[][],int m,int n) {
			PrintWriter pw = new PrintWriter(System.out);
			for (int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					pw.write(a[i][j]+" ");
					
				}
				pw.write("\n");
			}
			pw.flush();  
			pw.close();

		}
		//to print random number 
		public static int newRandom(int min, int max) {
		    Random r = new Random();
		    return r.nextInt((max - min) + 1) + min;
		}
		
//=======================Algorithm functions========================================		
		
		//Function to check number is palindrome or not
		public static boolean checkPalindrome(int n) {
			boolean b1;
		     int sum = 0, r;
			 int temp = n;    
		     while(n>0)
			   {    
		        r = n % 10;   
		        sum = (sum*10)+r;    
		        n = n/10;    
		       }    
		      if(temp==sum) {    
		        //number is palindrome
		        b1=true;
		      }
		      else {    
		       //Not a palindrome
		        b1=false;
		      }
		      
			return b1;    
		}
		/**
		 * function is used to check the integer are they anagram 
		 * @param i1:1st integer 
		 * @param i2:2nd integer
		 */
		public static boolean anagramChecker(Integer i1, Integer i2) {
			int l,l1,l2,present=0,notPresent=0;
			boolean b1=false;
			String s1=i1.toString();
			String s2=i2.toString();
			l1=s1.length();
			l2=s2.length();
			//to check the length
			if(l1==l2) {
				l=l1;
				//to check 1st String char
				for(int i=0;i<l;i++) {
					present=0;
					//to check 2nd String char
					for(int j=0;j<l;j++) {
						if(s1.charAt(i)==s2.charAt(j)) {
							present=1;
							break;
						}
					}
					if(present==0) {
						notPresent=1;
						break;
					}
				}
				if (notPresent==1) {
					//strings are not Anagram"
					b1=false;
				}
				else {
					//strings are Anagram
					b1=true;
				}
		}
			return b1;
		}
		/**
		 * function is used to check the strings are they anagram 
		 * @param s1:1st String 
		 * @param s2:2nd String
		 */
		public static boolean anagramChecker(String s1,String s2) {
			int l,l1,l2,present=0,notPresent=0;
			boolean b1;
			l1=s1.length();
			l2=s2.length();
			//to check the length
			if(l1==l2) {
				l=l1;
				//to check 1st String char
				for(int i=0;i<l;i++) {
					present=0;
					//to check 2nd String char
					for(int j=0;j<l;j++) {
						if(s1.charAt(i)==s2.charAt(j)) {
							present=1;
							break;
						}
					}
					if(present==0) {
						notPresent=1;
						break;
					}
				}
				if (notPresent==1) {
					//strings are not Anagram"
					b1=false;
				}
				else {
					//strings are Anagram
					b1=true;
				}
				
			}
			else {
				//enter both string of same length
				b1=false;
			}
			return b1;
		}
		
		
		/**
		 * Function to print n prime number.
		 * 
		 * @param n: number upto printed
		 */
		public static int getPrimeNumber(int n) {
			
				int reminder=0,pr=0;	
				for(int i=2;i<n;i++){
					  if(n%i==0){
						  reminder++;
						  break;
					  }
				}
				if(reminder==0) {
					pr=n;
				}
				return pr;
		}

		

}
