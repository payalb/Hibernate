package com.java.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.PushbackReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		File dir= new File("E:\\");
		File file= new File(dir,"abc.txt");
file.createNewFile();
//System.out.println(file.exists());

Path path= Paths.get("E:\\java\\networking");	
//System.out.println(path.getNameCount());

String data= "hello there! I am in a college";
char[] buff= new char[(int)file.length()];
PrintWriter writer= new PrintWriter(System.out);
PushbackReader reader= new PushbackReader(new FileReader("E:\\abc.txt"));
	while(reader.read(buff,0,(int) file.length())!=-1){
		String str= new String(buff, 0, buff.length);
		if(str.contains(data)){
		writer.write(str.replace(data, ""));
		}else{
		writer.write(buff);
		}
		writer.flush();
	}
	writer.close();
	reader.close();
	}
}
