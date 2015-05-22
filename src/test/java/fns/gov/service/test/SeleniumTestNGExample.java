package fns.gov.service.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import fns.gov.service.IEBrowserUtil;

public class SeleniumTestNGExample {
	
	@Test()
	public void loadTestWebsite() {
        IEBrowserUtil.setSystemProperty();
        WebDriver driver = IEBrowserUtil.getIEDriver();        
		
		driver.navigate().to("http://www.google.com");
		System.out.println("Page Title is " + driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
		driver.quit();
 
	}

}
