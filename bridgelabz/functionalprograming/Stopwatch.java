/******************************************************************************
 * 
 *  
 *  Purpose: To find elapse time between start and stop in stopwatch.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   16-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograming;

import com.bridgelabz.utilpackage.Utility;


public class Stopwatch {
	 static long start;
	 /**
	  * Function is used to start stopwatch
	  */
	 public void getStart() {
		 //to take current time im millisec
		 start=System.currentTimeMillis();
		 System.out.println("start"+start);
	 }
	 /**
	  * function is used to stop and display elapse time
	  */
	 public void elapsedTime() {
		//to take current time im millisec
		 long stop=System.currentTimeMillis();
		 System.out.println("stop"+stop);
		 double elapse=(stop-start)/1000.0;
		System.out.println("elapse time: "+elapse);
	 }
	 /*
	  * The main function is written to test stopwatch  class
	  */
	public static void main(String[] args) {
		Stopwatch st=new Stopwatch();
		System.out.println("enter 1 to start the stop watch");
		   int ch=Utility.getInteger();
		
		   if(ch==1) 
		   {
			   //calling start function
			   st.getStart();
		   }
		   
		   System.out.println("enter 2 to stop the stop watch");
		   
		   int ch2=Utility.getInteger();
		   
		   if(ch2==2)
		   {
			   //calling stop function
			   st.elapsedTime();
			   System.out.println("*****");
		   }
	        
		
	}

	

}
