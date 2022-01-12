package com.ng.webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularButtonText;
import com.paulhammant.ngwebdriver.ByAngularModel;
import com.paulhammant.ngwebdriver.NgWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalculatorWebPage 
{
	WebDriver driver;
	NgWebDriver ngWebDriver;
	JavascriptExecutor jsDriver;
	
	ByAngularModel Element1 = ByAngular.model("first");
	ByAngularModel Element2 = ByAngular.model("second");
	ByAngularModel Operators = ByAngular.model("operator");
	ByAngularButtonText GoButton = ByAngular.buttonText("Go!");
	
	By answer = By.tagName("h2");
	
	public CalculatorWebPage()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		jsDriver = (JavascriptExecutor)driver;
		ngWebDriver = new NgWebDriver(jsDriver);
		driver.get("http://localhost:3456/");
		ngWebDriver.waitForAngularRequestsToFinish();
		driver.manage().window().maximize();
		
	}
	
	public String doSum(String v1, String v2)
	{
		driver.findElement(Element1).clear();
		driver.findElement(Element1).sendKeys(v1);
		
		driver.findElement(Element2).clear();
		driver.findElement(Element2).sendKeys(v2);
		
		driver.findElement(Operators).sendKeys("+");
		driver.findElement(GoButton).click();
		
		ngWebDriver.waitForAngularRequestsToFinish();
		
		System.out.println(driver.findElement(answer).getText());
		return driver.findElement(answer).getText();
	}
	
	public String doSub(String v1, String v2)
	{
		driver.findElement(Element1).clear();
		driver.findElement(Element1).sendKeys(v1);
		
		driver.findElement(Element2).clear();
		driver.findElement(Element2).sendKeys(v2);
		
		driver.findElement(Operators).sendKeys("-");
		driver.findElement(GoButton).click();
		
		ngWebDriver.waitForAngularRequestsToFinish();
		
		System.out.println(driver.findElement(answer).getText());
		return driver.findElement(answer).getText();
	}
	
	public String doMul(String v1, String v2)
	{
		driver.findElement(Element1).clear();
		driver.findElement(Element1).sendKeys(v1);
		
		driver.findElement(Element2).clear();
		driver.findElement(Element2).sendKeys(v2);
		
		driver.findElement(Operators).sendKeys("*");
		driver.findElement(GoButton).click();
		
		ngWebDriver.waitForAngularRequestsToFinish();
		
		System.out.println(driver.findElement(answer).getText());
		return driver.findElement(answer).getText();
	}
	
	public String doDiv(String v1, String v2)
	{
		driver.findElement(Element1).clear();
		driver.findElement(Element1).sendKeys(v1);
		
		driver.findElement(Element2).clear();
		driver.findElement(Element2).sendKeys(v2);
		
		driver.findElement(Operators).sendKeys("/");
		driver.findElement(GoButton).click();
		
		ngWebDriver.waitForAngularRequestsToFinish();
		
		System.out.println(driver.findElement(answer).getText());
		return driver.findElement(answer).getText();
	}
	
}
