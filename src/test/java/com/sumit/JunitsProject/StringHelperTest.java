package com.sumit.JunitsProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();
	
	@Test
	public void testTruncateAInFirst2Poitions() {
		//fail("Not yet implemented");
//		StringHelper helper = new StringHelper();
		assertEquals("BC", helper.truncateAInFirst2Poitions("AABC"));
	}
	
	@Test
	public void testTruncateAInFirst2Poitions_2() {
		//StringHelper helper = new StringHelper();
		assertNotEquals("BCD", helper.truncateAInFirst2Poitions("ABC"));
	}
	
	@Test
	public void testTruncateAInFirst2Poitions_3() {
		//StringHelper helper = new StringHelper();
		assertEquals("B", helper.truncateAInFirst2Poitions("AB"));
	}
	
	@Test(expected = NullPointerException.class)
	public void testTruncateAInFirst2Poitions_NullCheck() {
		//StringHelper helper = new StringHelper();
		assertEquals("B", helper.truncateAInFirst2Poitions(null));
	}
	
	@Test
	public void test() {
		assertFalse("my test", 3>4);
		assertTrue(4>3);
	}
}
