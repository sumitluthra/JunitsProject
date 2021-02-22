package com.sumit.JunitsProject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAftertest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before class should be static");
	}
	
	@Before
	public void setup() {
		System.out.println("Before Setup");
	}
	
	@Test
	public void test_1() {
		System.out.println("test 1 implemented");
	}
	
	@Test
	public void test_2() {
		System.out.println("test 2 implemented");
	}

	@After
	public void tearDown() {
		System.out.println("After Setup");
	}
}
