package com.lti.webs.MyMavenApp;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator clr=new Calculator();
		int res=clr.add(2, 3);
		assertEquals(5,res);
	}
	
	
	

}

