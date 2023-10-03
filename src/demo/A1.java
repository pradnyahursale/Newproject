package demo;

import org.testng.annotations.Test;

public class A1 {
	
	@Test(priority = 2)
	public void M1()
	{
		System.out.println("I am Method 1");
	}
	
	@Test(priority = 1)
	public void M2()
	{
		System.out.println("I am Method 2");
	}
	
	@Test(priority =3)
	public void M3()
	{
		System.out.println("I am Method 3");
	}

}
