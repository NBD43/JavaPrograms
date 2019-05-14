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

}
