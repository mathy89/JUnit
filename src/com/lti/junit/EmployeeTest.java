package com.lti.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void mySimpleEqualsTest() {
		String expectedName="mathy";
		assertEquals(expectedName,Employee.getEmpNameWithHigherSalary() );
		
	}
	
	@Test
	public void myObjectEqualsTest() {
		Employee expectedEmpObj=new Employee(1, "mathew", 15000);
		assertEquals(expectedEmpObj,Employee.getHighestPaidEmployee() );
	
	}

}
