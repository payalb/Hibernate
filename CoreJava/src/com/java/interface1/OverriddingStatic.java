package com.java.interface1;

class Building{
	
	public static void add(){
		System.out.println("bldg");
	}
}

class Barn extends Building{
	public void sub(){
		System.out.println("Barn");
	}
	
	public static void main(String args[]){
		Building obj= new Building();
		Building.add();
		
		Barn obj1= new Barn();
		obj1.add();
		Barn.add();
		obj1.sub();
		
		Building obj2= new Barn();
		obj2.add();
		
	Barn obj3= (Barn)obj2;
		obj3.add();
		obj3.sub();
	}
}