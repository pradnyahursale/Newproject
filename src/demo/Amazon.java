package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
	
	@Test
	
	public void login()
	{
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
	}

}
