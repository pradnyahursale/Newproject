package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("this code will execute before the class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("this code will execute after every class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("this code will execute before every @Test method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("this code will execute after every @Test method");
	}
	
	@Test
	public void m1()
	{
		System.out.println("This is first method");
	}
	
	@Test
	public void m2()
	{
		System.out.println("this is second method");
	}

}
