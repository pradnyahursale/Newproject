package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class A {
	
	static WebDriver driver;   //use static variable 
	
	@BeforeClass
	public void enterUrl()
	{
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Test
	public void login() throws InterruptedException
	{
      
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(1000);
		
		System.out.println(driver.getTitle());
	}
	

}
