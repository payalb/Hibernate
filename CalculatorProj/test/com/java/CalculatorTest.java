package com.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
	
	Calculator obj;
	
	@Before
	public void setup(){
		obj= new Calculator();
	}
	
	@Test
	public void test1(){
	assertNull(obj.getString(5));
	}
	
	@Test
	public void test2(){
	assertEquals("a is between -5 and 5",obj.getString(-3));
	}
	@Test
	public void test3(){
	assertNull(obj.getString(-5));
	}
}
