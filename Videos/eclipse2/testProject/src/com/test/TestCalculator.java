package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Calculator;

class TestCalculator {
// this test case ios staryted 4 timeds bcs 4cv method ois not present.
	
	private Calculator c;
	@BeforeEach//setup
	void setUp() throws Exception {
		c=new Calculator();
	}

	@AfterEach//tear down 
	void tearDown() throws Exception {
		
		c=null;
	}

	@Test//for testing the case.
	void testAdd() {
		int i=c.add(6,3);
		
		assert i> 5:"result should not be greater than 5";
		/*(i>5)
		{
			
			System.out.println("result should not be greater than 5");
		}*/
	}

	@Test
	void testDiv() {
		System.out.println("Not yet implemented");
	}

	@Test
	void testSub() {
		System.out.println("Not yet implemented");
	}

	@Test
	void testMul() {
		System.out.println("Not yet implemented");
	}

}
