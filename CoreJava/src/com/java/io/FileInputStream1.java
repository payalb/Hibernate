package com.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStream1 {

	public static void main(String[] args) throws IOException{
		FileInputStream str= new FileInputStream("C:/Users/Dell/Pictures/images1.jpg");
		int i=0, temp=0;
		byte[] b= new byte[5747473];
		while(i != -1){
			i=str.read();
			b[temp]= (byte) i;
		}
		str.close();
		FileOutputStream os= new FileOutputStream("E:/abc.jpg");
		os.write(b);
		os.close();
	}

}
