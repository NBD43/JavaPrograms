package com.bridgelabz.datastructureprograms;

import java.nio.file.Files;
import com.bridgelabz.datastructure.*;
import java.nio.file.Paths;

import com.bridgelabz.utilpackage.Utility;

public class UnorderedList {
	/**
	 * Function to read the File
	 * @param filename:demo.txt
	 * @return: data of the file
	 * @throws Exception: if file is not found
	 */
	public static String readFileAsString(String filename)throws Exception{
		String data="";
		data=new String(Files.readAllBytes(Paths.get(filename)));
		return data;
	}

	public static void main(String[] args) throws Exception {
//		//read the file from the source
//				String d=readFileAsString("/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/algorithmprograms/demo.txt");
//				//split the string into array
//			 
//				String [] a=d.trim().split(",");
//				System.out.println("enter the string to find");
//				String x=Utility.getString();
//		
		
//		LinkedList l1=new LinkedList();
//		l1.insert(8);
//		l1.insert(6);
//		l1.insert(3);
//		l1.insert(7);
//		l1.insertAt(3, 44);
//		l1.insertAtStart(1);
//		l1.deleteAt(2);
//		l1.show();
		
//		Stack st=new Stack();
//		st.push(1);
//		st.push(5);
//		st.push(10);
//		st.push(20);
//		st.show();
//		st.pop();
//		System.out.println();
//		st.peak();
//		st.push(11);
//		st.push(52);
//		st.push(12);
//		st.push(23);
//		st.show();
		
		
		Queue qu=new Queue();
		qu.enQueue(3);
		qu.enQueue(5);
		qu.enQueue(4);
		qu.enQueue(7);
		qu.show();
		
	}

}
