package com.java.demo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class OneTest {
	
	int number1;
	int number2;
	int result;

	One obj;
	@Before
	public void init(){
		obj= new One();
	}
	
public 	OneTest(int a, int b, int result){
		number1= a;
		number2= b;
		this.result= result;
	}
@Test	
public void testAdd(){
	assertEquals(obj.add(number1, number2), result);
}

@Parameterized.Parameters
public static Collection fields(){
	return Arrays.asList(new Integer[][]{
		{2,3, 5},
		{0,0,0},
		{-2,-3, -5}
	});
}
}
