/**
 * 
 */
package com.src.java;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CounterTest {
	
	private Counter obj;
	
	@Before
	public void setUp() throws Exception {
		 obj= new Counter();
	}

	@After
	public void tearDown() throws Exception {
		obj.setCounter(0);
	}

	@Test
	public void testIncrement() {
		assertEquals(1, obj.increment());
		assertEquals(2, obj.increment());
	}
	@Test
	public void testDeccrement() {
		assertEquals(-1, obj.decrement());
		assertEquals(-2, obj.decrement());
	}
}
