package com.java.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testStringNull() {
		String output=StringUtils.swapLastTwoChar(null);
		assertNull(output);
	}
	@Test
	void testStringEmpty1() {
		String output=StringUtils.swapLastTwoChar("");
		assertEquals("", output, "Test failed for empty string!");
	}
	@Test
	void testStringEmpty2() {
		String output=StringUtils.swapLastTwoChar(" ");
		assertEquals(" ", output, "Test failed for empty string!");
	}
	@Test
	void testStringEmpty3() {
		String output=StringUtils.swapLastTwoChar("  ");
		assertEquals("  ", output, "Test failed for empty string!");
	}
	
	@Test
	void testString1Char() {
		String output=StringUtils.swapLastTwoChar("h");
		assertEquals("h", output, "Test failed for one char in a string!");
	}

	@Test
	void testString2Char1() {
		String output=StringUtils.swapLastTwoChar("ha");
		assertEquals("ah", output, "Test failed for two char in a string!");
	}
	
	@Test
	void testString2Char2() {
		String output=StringUtils.swapLastTwoChar("!@");
		assertEquals("@!", output, "Test failed for two char in a string!");
	}
}
