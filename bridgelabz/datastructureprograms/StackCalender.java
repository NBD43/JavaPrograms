/******************************************************************************
 * 
 *  Purpose: Store the Calendar in an 2D Array  using Stack .
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   27-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructureprograms;

import java.util.Scanner;
import com.bridgelabz.datastructure.*;

public class StackCalender {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Month:");
		int mon=scn.nextInt();
		System.out.println("Enter the Year:");
		int year=scn.nextInt();
		calendarDisplay(mon,year);

	}
	private static void calendarDisplay(int month, int year) {
		String months[]= { "January", "Februry", "March", "April", "May", "June", "July", "August", "September", "October",
				"November", "December" };
		
		Stack<String> st = new Stack<String>();
		int d0=dayOfWeek(month, year);
		System.out.println("do is "+d0);
		int start = d0;
		int totalDaysOfMonth = 0, count = 1;
		if(month==2) {
			if(isLeapYear(year)) {
				totalDaysOfMonth=29;
			}else {
				totalDaysOfMonth=28;
			}
			
		}else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
			totalDaysOfMonth=31;
		}else {
			totalDaysOfMonth=30;
		}
		
		while(start!=0) {
			st.push("  ");
			start--;
		}
		while(count<=totalDaysOfMonth) {
			st.push(String.valueOf(count)+" ");
			count++;
		}
		System.out.println(months[month-1]+" "+year);
		System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
		count=1;
		while(!st.isEmpty()) {
			String result=st.pop();
			System.out.print(result+"\t");
			if(count%7==0) {
				System.out.println();
			}
			count++;
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
	private static boolean isLeapYear(int year) 
	{
		 if  ((year % 4 == 0) && (year % 100 != 0)) return true;
		   if  (year % 400 == 0) return true;
		   return true;
		
	}

}
