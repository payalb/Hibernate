package com.java.generics;

import java.util.ArrayList;

public class Four {

	public static void main(String[] args) {
		Four obj= new Four();
		ArrayList<String> al= new ArrayList<>();
		al.add("dsjh");
		//al.add(3);
		al.add("347647");
		obj.addElem(al);
		System.out.println(al);
	}
	
	public void addElem(ArrayList<? super Object> l){
		l.add(37);
	}

	

}

