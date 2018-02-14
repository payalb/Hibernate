package com.java.generics;

public class Three {

	public static void main(String[] args) {
	Three_Demo object= new Three_Demo();
	object.setData(192);
	System.out.println(object.getData());
	}
}
class Three_Demo<T extends Number >{ //Bounded types : using extends keyword

T obj;

public <K extends Number> T getData(K k){
//	return obj*4; //arithmetic operator not valid for all data-types. Then we should bound the type parameter to be number
	k= (K) new Integer(5);
	return obj;
}

public void setData(T data){
	this.obj= data;
}
}

class Four_Demo<X>{ //Bounded types : using extends keyword

X obj;

public X getData(){
//	return obj*4; //arithmetic operator not valid for all data-types. Then we should bound the type parameter to be number
	return obj;
}

public void setData(X data){
	this.obj= data;
}
}

/*class Three_Demo<T super Number>{ //Bounded types : using extends keyword
	
	T obj;
	
	public T getData(){
	//	return obj*4; //arithmetic operator not valid for all data-types. Then we should bound the type parameter to be number
		return obj;
	}
	
	public void setData(T data){
		this.obj= data;
	}
}*/

/*class Three_Demo<T implements Number>{ //Bounded types : using extends keyword

T obj;

public T getData(){
//	return obj*4; //arithmetic operator not valid for all data-types. Then we should bound the type parameter to be number
	return obj;
}

public void setData(T data){
	this.obj= data;
}
}*/