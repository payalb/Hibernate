package com.java.externalizable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Demo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream writer= new FileOutputStream("abc.txt");
		ObjectOutputStream oos= new ObjectOutputStream(writer);
		Person p = new Person();
		p.id= 1;
		p.name="dshf";
		oos.writeObject(p);
		
		
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream("abc.txt") );
		Person p1= (Person) ois.readObject();
		System.out.println(p1.name);
	}

}


class Person extends A implements Serializable{
	int id;
	String name;
	Address address;
	public Person(){}
	/*@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(this.id);
		out.writeObject(this.name+" Surname");
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
	id=in.readInt();
	name= (String)in.readObject();
		}
	}*/
	

}
class A{
}
