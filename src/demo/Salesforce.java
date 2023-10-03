package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Salesforce {
	
	@Test
	
	public void login()
	{
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
	}

}
