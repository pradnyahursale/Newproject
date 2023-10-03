package demo;

import org.testng.annotations.Test;

public class A2 {
	
	@Test(groups = "smoke")
	public void C1()
	{
		System.out.println("I am yellow");
	}
	
	
	@Test(groups = "regression")
	public void C2()
	{
		System.out.println("I am red");
	}
	
	@Test(groups = "smoke")
	public void C3()
	{
		System.out.println("I am green");
	}
	
	

}
