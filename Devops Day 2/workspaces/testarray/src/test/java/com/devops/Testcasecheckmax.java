package com.devops;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testcasecheckmax {
	
	int[] test1arr=new int[]{1,6,3,4,40,20};
	int[] test2arr=new int[]{10,3,5,6,20,10,70,34};
	int[] test3arr=new int[]{100,3,6,400,340,250,600,350,10};
	Maxnumarray arr=new Maxnumarray();
	@Test
	public void test1() {
		assertEquals(40,arr.checkmax(test1arr));
	}
	@Test
	public void test2() {
		assertEquals(70,arr.checkmax(test2arr));
	}
	
	@Test
	public void test3() {
		assertEquals(600,arr.checkmax(test3arr));
	}

}