/******************************************************************************
 * 
 *  
 *  Purpose: Store the Calendar in an 2D Array.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   27-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructureprograms;

import java.util.Scanner;

public class Calendar {
	static int[][] arr = new int[6][7];
	static int[] month = {31,29,31,30,31,30,31,30,31,30,31,30};

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the month:");
		int mon=scn.nextInt();
		System.out.println("Enter the year:");
		int year=scn.nextInt();
		displayCalender(mon,year);
	}

	public static void displayCalender(int mon, int year) {
		int day=dayOfWeek(mon,year);
		System.out.println("dis"+day);
		initial();
		putCalender(day);
		displayMonth(mon);
		
	}

	private static void displayMonth(int mon) {
		System.out.println("	sun  	mon  	tue  	wed  	thu   	fri  	sat");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]<0 || arr[i][j]>month[mon-1]) {
					System.out.print("\t");
				}else if(arr[i][j]>0) {
					System.out.print("\t"+arr[i][j]+" ");
				}
			}
			System.out.println("\t");
		}
		
	}

	private static void putCalender(int day) {
		int d1=1;
		for(int i=day;i<arr[0].length;i++) {
			arr[0][i]=d1;
			d1++;
		}
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=d1;
				d1++;
			}
		}
		
	}

	private static void initial() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=-10;
			}
		}
		
	}

	public static int dayOfWeek(int mon, int year) {
		int day=1,y0,x,m0,d0;
		y0=year-(14-mon)/12;
		x=y0+(y0/4)-(y0/100)+(y0/400);
		m0=mon+12*((14-mon)/12)-2;
		d0=(day+x+31*m0/12)%7;
		return d0;
	}

}
