package com.tests.calculator;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ng.webpage.CalculatorWebPage;

public class CalculatorTestCases 
{
	CalculatorWebPage calPage;
	
	@BeforeTest
	public void setup()
	{
		calPage = new CalculatorWebPage();
	}
	
	@Test(priority=1)
	public void SumTest()
	{
		String res = calPage.doSum("10", "10");
		Assert.assertEquals(res, "20");
	}
	
	@Test(priority=2)
	public void SubTest()
	{
		String res = calPage.doSub("50", "30");
		Assert.assertEquals(res, "20");
	}
	
	@Test(priority=3)
	public void MulTest()
	{
		String res = calPage.doMul("10", "10");
		Assert.assertEquals(res, "100");
	}
	
	@Test(priority=4)
	public void DivTest()
	{
		String res = calPage.doDiv("20", "2");
		Assert.assertEquals(res, "10");
	}
	
}
