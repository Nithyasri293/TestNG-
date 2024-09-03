package com.test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Group2 {
	static WebDriver driver;
	@Test(groups = "regression")
	public void ajio() {
		driver=new EdgeDriver();
		driver.get("https://www.ajio.com");

	}
	
	@Test(groups = "smoke")
	public void myntra() {
		driver=new EdgeDriver();
		driver.get("https://www.myntra.com");

	}
	
	@Test(groups = "sanity")
	public void flipkart() {
		driver=new EdgeDriver();
		driver.get("https://flipkart.com/");

	}

}
