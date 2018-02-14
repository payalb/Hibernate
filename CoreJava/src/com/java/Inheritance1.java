package com.java;

import java.io.IOException;

public class Inheritance1 {
	 public static void main(String args[]) throws IOException {
	        parent p1 = new child();
	        p1.method();
	    }
}
class parent {
    int a;
    parent() {
        System.out.println("in parent");
        a = 10;
    }
   void method() {
        System.out.println(a);
    }
}
class child extends parent {
    int a;
    child() {
        System.out.println("in child");
        a = 11;
    }
}
