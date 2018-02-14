package com.java.patterns.prototype;
//CREATE NEW OBJECTS cloning other objects
public class PrototypeDemo {

	public static void main(String[] args) {
		Sheep s= new Sheep();
		CloneFactory factory= new CloneFactory();
		Sheep s1=(Sheep) factory.getClone(s);
		System.out.println(s1 == s);

	}

}

interface Animal extends Cloneable{
	public Animal makeCopy();
}

class Sheep implements Animal{

	@Override
	public Sheep makeCopy() {
		return (Sheep) this.clone();
	}
	
	public Object clone(){
		return null;
		
	}
}

class CloneFactory {
	public Animal getClone(Animal a){
		return a.makeCopy();
	}
}