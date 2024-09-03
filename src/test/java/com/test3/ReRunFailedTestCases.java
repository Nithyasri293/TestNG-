package com.test3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ReRunFailedTestCases {
	static WebDriver driver;
	@Test
	public void facebookLogin() {
		Assert.assertEquals(true, false);
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com");

	}
	
	@Test(retryAnalyzer = Retry.class)
	public void amazonLogin() {
		Assert.assertTrue(true);
		driver=new EdgeDriver();
		driver.get("https://www.amazon.com");
		Assert.fail();
	}
	
	@Test
	public void chatGpt() {
		Assert.assertEquals(false, false);
		driver=new EdgeDriver();
		driver.get("https://chatgpt.com/");

	}
	

}
