package com.java.generics;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		Public obj= new Public();
		obj.check("Payal");
	}

}

class Public<X> {
   
    public <X> void check(ArrayList object) {
           object.add(X);
    }
}

