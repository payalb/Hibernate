package com.java.generics;

public class One {

	public static void main(String[] args) {
	One_Demo<String> object= new One_Demo<>();
	object.setData("Hello");
	System.out.println(object.getData());
	}
}


class One_Demo<T>{ //unbounded type
	
	T obj;
	
	public T getData(){
	//	return obj*4; //arithmetic operator not valid for all data-types. Then we should bound the type parameter to be number
		return obj;
	}
	
	public void setData(T data){
		this.obj= data;
	}
}