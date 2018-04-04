package com.qa.test;

import org.testng.annotations.Test;

public class Simple1Test {
	//Added Comment
	
	@Test
	public void add()
	{
		int a = 20;
		int b=10;
		System.out.println(a+b);
	}
	@Test
	public void sub()
	{
		int a = 20;
		int b=10;
		System.out.println(a-b);
	}
	@Test
	public void mul()
	{
		int a = 20;
		int b=10;
		System.out.println(a*b);
	}
	@Test
	public void div()
	{
		//
		int a = 20;
		int b=10;
		System.out.println(a/b);
	}
}
