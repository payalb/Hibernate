package com.java.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File3 {
	
	//To read from a file and copy it's content in a new file .

	public static void main(String[] args) throws InterruptedException, IOException {

			File file= new File("C:/Users/Dell/workspace/CoreJava/.classpath");
			if(file.exists()){
				File f= new File("C:/Users/Dell/workspace/CoreJava/.classpath_copy");
				if(!f.exists()){
					f.createNewFile();
				}
			FileReader reader= new FileReader(file);
				//Overwrite existing file.So false in the constructor
				FileWriter writer= new FileWriter(f,false);
				char c;
				while((c= (char) reader.read())!= (char)-1){
					writer.write(c);
				}
				reader.close();
				writer.close();
			}
	}

}
