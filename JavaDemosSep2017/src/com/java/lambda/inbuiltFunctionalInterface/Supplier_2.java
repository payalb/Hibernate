package com.java.lambda.inbuiltFunctionalInterface;

import java.util.function.Supplier;

public class Supplier_2 {

	public static void main(String[] args) {
		Supplier<String> nameSupplier= new Supplier<String>(){

			@Override
			public String get() {
				return "Kirti";
			}
		};
		System.out.println(nameSupplier.get());
		
		Supplier<String> nameSupplier1= ()->"Kirti";
		System.out.println(nameSupplier1.get());
	}

}

