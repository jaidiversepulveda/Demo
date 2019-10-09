package com.example.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OperationsImpTest {

	public static Operations oper;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		oper = new OperationsImp();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		oper = null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testSum1() throws Exception {
		assertEquals(2, oper.sum(1, 1));
	}
	
	@Test
	public final void testSum2() throws Exception {
		assertEquals(3, oper.sum(1, 2));
	}

}
