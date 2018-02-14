package com.java.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class ObjectOutputStream1 {
	public static void main(String[] args) throws IOException {
		User obj= new User(1, "Kirti");
		FileOutputStream os= new FileOutputStream("E:/abc.txt");
		//os.write(obj);
		ObjectOutputStream oos= new ObjectOutputStream(os);
		oos.writeObject(obj);
		oos.close();
		os.close();
	}
}
class User implements Serializable{
	int id;
	final String name;
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}