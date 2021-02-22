package com.sumit.JunitsProject;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

	StringHelper helper = new StringHelper();
	private String input;
	private String output;
	
	public StringHelperParameterizedTest(String input, String output) {
		// TODO Auto-generated constructor stub
		this.input= input;
		this.output= output;
	}
	
	@Parameters
	public static Collection<String[]> testConditions() {
		String [][] arr2D={{"AABC","BC"},
		{"BCD","BCD"}};
		
		return Arrays.asList(arr2D);
	}
	@Test
	public void testTruncateAInFirst2Poitions() {
		assertEquals(output, helper.truncateAInFirst2Poitions(input));
	}
	/*
	 * @Test public void testTruncateAInFirst2Poitions_2() { assertEquals(output,
	 * helper.truncateAInFirst2Poitions(input)); }
	 */
	

}
