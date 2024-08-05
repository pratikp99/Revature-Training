package com.revature;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.revature.Calculator;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {
	
	
	@Test 
    //@Disabled
	@Order(2)
	public void testSumPositive(){
		Calculator calculator=new Calculator();
		int input1=10;
		int input2=10;
		int result=0;
		
		System.out.println("Positive");
		
		result=calculator.sum(input1, input2);
		
		Assertions.assertEquals(20, result);
		
	}
	
	@Test
	@Order(1)
	@DisplayName("Difference Between Two Numbers:")
	public void testDifference(){
		Calculator calculator=new Calculator();
		
		int input1=20;
		int input2=10;
		int result=0;
		System.out.println("Negative");
		
		result=calculator.difference(input1, input2);
		
		Assertions.assertEquals(10, result);
		
	}

	@BeforeEach
	public void beforeEachMethod() {
		System.out.println("Before Each");
	}
	@AfterEach
	public void afterEachEachMethod() {
		System.out.println("After Each");
	}
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before All");
		
	}
	@AfterAll
	public static void afterAll() {
		System.out.println("After All");
	}

}
