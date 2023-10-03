package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A3 {
	
	@Test
	public void M1()
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	}
	

}
