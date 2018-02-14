package com.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream1 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream("E:/abc.txt"));
		User u= (User) ois.readObject();
		System.out.println(u.name);
		
	}

}
