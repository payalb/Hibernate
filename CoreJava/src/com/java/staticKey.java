package com.java;

public class staticKey {
	 static {
		  System.out.println("static:");
		 }
		 {
		  System.out.println("block");
		 }

		 public staticKey() {
		  System.out.println("A");
		 }

		 public static void main(String[] args) {
			 staticKey a ;
		 }
		}
