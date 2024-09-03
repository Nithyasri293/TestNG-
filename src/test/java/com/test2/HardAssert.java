package com.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class HardAssert {
	static WebDriver driver;
	@Test
	public void login() {
		Assert.assertEquals(false, true);
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("nithya29@gmail.com");

	}
	
	@Test
	public void login1() {
		Assert.assertEquals(true, true);
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("nithya29@gmail.com");
		WebElement element2 = driver.findElement(By.name("login"));
		element2.click();

	}

	@Test
	public void login2() {
		Assert.assertEquals(true, false);
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com");

	}
	
	@Test
	public void login3() {
		Assert.assertEquals(false, false);
		driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		

	}
	
	@Test
	public void login4() {
		Assert.assertTrue(false);
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		

	}
	
	@Test
	public void login5() {
		Assert.assertTrue(true);
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("nithya29@gmail.com");
		WebElement element2 = driver.findElement(By.name("pass"));
		element2.sendKeys("1258663");

	}
}
