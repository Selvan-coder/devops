package com.firstmaventest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcaseforcal {
	calculator cal=new calculator();

	@Test
	public void testadd() {
		assertEquals(50,cal.addnum(20, 30));
	}
	
	@Test
	public void testsub() {
		assertEquals(10,cal.subnum(30, 20));
	}
	@Test
	public void testmul() {
		assertEquals(20,cal.mulnum(5, 4));
	}
	@Test
	public void testdiv() {
		assertEquals(2,cal.divnum(20,10));
	}
	@Test
	public void testmod() {
		assertEquals(0,cal.modnum(1,1));
	}

}