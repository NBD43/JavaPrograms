package com.bridgelabz.datastructureprograms;


import com.bridgelabz.datastructure.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

import com.bridgelabz.utilpackage.Utility;

public class UnorderedList {
	

	public static void main(String[] args) throws Exception {	
//		 File file = new File("/home/bridgeit/nbd.txt"); 
//		    Scanner sc = new Scanner(file); 
//		  
//		    // we just need to use \\Z as delimiter 
//		    sc.useDelimiter("\\Z"); 
//		  
//		    System.out.println(sc.next()); 
//		
		
		 // pass the path to the file as a parameter 
		LinkedList1<String> link=new LinkedList1<String>();
	    File file = 
	      new File("/home/bridgeit/nbd.txt"); 
	    Scanner sc = new Scanner(file); 
	  
	    while (sc.hasNextLine()) 
	    	//link.insert(sc.nextLine());
	      System.out.println(sc.nextLine()); 
	  
		
		
		

		
		
	}
}


