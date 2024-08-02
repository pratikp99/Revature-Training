package com.revature.files.bytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
public static void main(String[] args) {
	FileInputStream input;
	FileOutputStream output;
	
	try {
		input=new FileInputStream("G:\\FileHandling\\222.png");
		output=new FileOutputStream("G:\\FileHandling\\2221.png");
		int c;
		while((c=input.read())!=-1)
			output.write(c);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}