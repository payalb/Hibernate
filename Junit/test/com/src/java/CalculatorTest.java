package com.src.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class CalculatorTest {


Calculator calculator;/* = new Calculator();*/
@Test
public void testAdd() {
	calculator= mock(Calculator.class);
	when(calculator.add(anyDouble(), anyDouble())).thenReturn(0.0);
	/*String str1= new String("Junit is working fine!!");
	int num=5;
	String str= "Junit is working fine!!";
	assertEquals(str, "Junit is working fine!!");
	assertEquals(str1, "Junit is working fine!!");
	assertSame(str, "Junit is working fine!!");
	assertSame(str1, "Junit is working fine!!");
	assertFalse(num>6);
	assertNotNull(str);*/
	assertEquals(calculator.add(3.2, 4.6), 0.0, 0.0);
	System.out.println(calculator.mul(2.3, 4.6));

}

}
