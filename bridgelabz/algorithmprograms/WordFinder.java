package com.bridgelabz.algorithmprograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordFinder {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("demo.txt");
		   int i;    
	          while((i=fr.read())!=-1)    
	          System.out.print((char)i);    
	          fr.close();    
		

	}

}
