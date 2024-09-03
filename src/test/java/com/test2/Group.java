package com.test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Group {
	static WebDriver driver;
	@Test(groups = "regression")
	public void facebookLogin() {
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com");

	}
	
	@Test(groups = "smoke")
	public void amazonLogin() {
		driver=new EdgeDriver();
		driver.get("https://www.amazon.com");

	}
	
	@Test(groups = "sanity")
	public void chatGpt() {
		driver=new EdgeDriver();
		driver.get("https://chatgpt.com/");

	}
	
	@Test(groups = "smoke")
	public void gitHub() {
		driver=new EdgeDriver();
		driver.get("https://github.com/");

	}
	
	@Test(groups = "regression")
	public void meesho() {
		driver=new EdgeDriver();
		driver.get("https://meesho.com/");

	}
	
	

}
