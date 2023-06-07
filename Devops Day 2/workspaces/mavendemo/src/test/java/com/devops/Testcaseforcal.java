package com.devops;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testcaseforcal {
	
	calculator cal=new calculator();

	@Test
	public void testadd() {
		assertEquals(50,cal.addnum(20, 30));
	}
	@Test
	public void testsub() {
		assertEquals(0,cal.subnum(30, 30));
	}
	
	@Test
	public void testmul() {
		assertEquals(600,cal.mulnum(20, 30));
	}
	@Test
	public void testdiv() {
		assertEquals(10,cal.divnum(30, 3));
	}
	@Test
	public void testmod() {
		assertEquals(0,cal.modnum(30, 30));
	}
	

}
