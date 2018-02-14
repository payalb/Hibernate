package com.java.generics;

public class Two {

	public static void main(String[] args) {
	Two_Demo<Integer> object= new Two_Demo<>();
	object.setData(192);
	System.out.println(object.getData());
	}
}


class Two_Demo<T extends Number>{ //Bounded types : using extends keyword
	
	T obj;
	
	public T getData(){
	//	return obj*4; //arithmetic operator not valid for all data-types. Then we should bound the type parameter to be number
		return obj;
	}
	
	public void setData(T data){
		this.obj= data;
	}
}