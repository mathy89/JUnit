package com.lti.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class SuiteTest1 {

	public String message="mathy";
	JUnitMessage junitMessage=new  JUnitMessage(message); 
	
	
	@Test
	public void testJUnitMessage() {
		
		System.out.println("Junit Message is printing");
		junitMessage.printMessage();
	}

	@Test
	public void testJUnitHiMessage() {
		message ="Hi"+message;
		System.out.println("Junit Hi Message is printing");
		assertEquals(message, junitMessage.printHiMessage());
	    System.out.println("suite test 1 is successful"+" "+message);
	}
}
