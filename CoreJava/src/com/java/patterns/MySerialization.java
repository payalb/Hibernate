package com.java.patterns;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MySerialization {

	public static void main(String[] args) throws IOException {
		List<String> addresses= Arrays.asList("dfgdfgfd fdghfdhjgfd", "dsgfjhsgd sdhgfhsd");
		Person person1= new Person(1, "Payal", addresses);
		ObjectOutputStream writer= new ObjectOutputStream(new FileOutputStream("Data.txt"));
		writer.writeObject(person1);
	}

}


class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	int id;
	String name;
	List<String> addresses= new ArrayList<>();
	MyConnectionPool obj= MyConnectionPool.getInstance();
	
	public Person(int i, String string, List<String> addresses2) {
		this.id=i;
		this.name= string;
		this.addresses= addresses2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAddresses() {
		return new ArrayList<String>(addresses);
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

	  private synchronized void writeObject(java.io.ObjectOutputStream s)
		        throws java.io.IOException {
		  s.write(this.getId());
		  s.writeBytes(this.getName());
		  for(String str: this.getAddresses()){
			  s.writeBytes(str);
	  }
	  }
}