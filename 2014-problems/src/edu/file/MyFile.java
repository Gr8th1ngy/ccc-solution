package edu.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFile {

	static final String MY_FILE = System.getProperty("user.dir") + "\\resource\\";
	
	public static void main(String[] args) throws IOException {
	
		System.out.println("This is locate: "  + System.getProperty("user.home"));
		System.out.println("This is locate: "  + System.getProperty("user.dir"));
		
		FileReader fRead = new FileReader(MY_FILE+ "j3.1.in");
		System.out.println(fRead.read());
		

	}

}
