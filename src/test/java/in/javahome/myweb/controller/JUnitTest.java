package in.javahome.myweb.controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest {
	
	@Test
	public void simpleTest(){
		int a=1;
		int b=2;
		assertTrue(a+b==3);
	}

}