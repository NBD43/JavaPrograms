package com.bridgelabz.functionalprograming;

import com.bridgelabz.utilpackage.Utility;


public class Stopwatch {
	 static long start;
	 public void stopwatch() {
		 start=System.currentTimeMillis();
		 System.out.println("start"+start);
	 }
	 
	 public void elapsedTime() {
		 long stop=System.currentTimeMillis();
		 System.out.println("stop"+stop);
		 
		 
		
	 }
	public static void main(String[] args) {
		Stopwatch st=new Stopwatch();
		System.out.println("enter 1 to start the stop watch");
		   int ch=Utility.getInteger();
		
		   if(ch==1) {
			   st.stopwatch();
		   }
		   System.out.println("enter 2 to stop the stop watch");
		   int ch2=Utility.getInteger();
		   if(ch==2) {
			   st.elapsedTime();
		   }
	        
		
	}

	

}
