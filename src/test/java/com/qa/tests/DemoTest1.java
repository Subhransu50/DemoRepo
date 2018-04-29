package com.qa.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class DemoTest1 {

	@Test
	public void sum()
	{
		System.out.println("Sum");
		int a=10;
		int b=20;
		assertEquals(30, a+b);
	}
	
	@Test
	public void sub()
	{
		System.out.println("Sub");
		int a=10;
		int b=20;
		assertEquals(10, b-a);
	}
	
	@Test
	public void mul()
	{
		System.out.println("Mul");
		int a=10;
		int b=20;
		assertEquals(200, a*b);
	}
	@Test
	public void div()
	{
		System.out.println("Div");
		int a=10;
		int b=20;
		assertEquals(2, b/a);
	}
	
}
