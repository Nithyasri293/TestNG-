package com.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.test1.GlobalClass;

public class SoftAsserts{
	
	static SoftAssert s=new SoftAssert();
	
	@Test
	public void signUp() {
		s.assertEquals(false, true, "SIGNUP");
		System.out.println("signup");
		 WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("nithya29@gmail.com");
		WebElement element2 = driver.findElement(By.name("pass"));
		element2.sendKeys("1258663");
	}
	
	@Test
	public void login() {
		s.assertEquals(true, true, "LOGIN");
		System.out.println("login");
		 WebDriver driver=new EdgeDriver();
			driver.get("https://www.facebook.com");
			WebElement element = driver.findElement(By.id("email"));
			element.sendKeys("nithya29@gmail.com");
			WebElement element2 = driver.findElement(By.name("pass"));
			element2.sendKeys("1258663");
	}
	
	@Test
	public void searchProduct() {
		s.assertEquals(false, false, "SEARCHPRODUCT");
		System.out.println("searchproduct");
		 WebDriver driver=new EdgeDriver();
			driver.get("https://www.facebook.com");
			WebElement element = driver.findElement(By.id("email"));
			element.sendKeys("nithya29@gmail.com");
			WebElement element2 = driver.findElement(By.name("pass"));
			element2.sendKeys("1258663");
	}
	
	@Test
	public void addToCart() {
		s.assertEquals(true, false, "ADDTOCART");
		System.out.println("addtocart");
		 WebDriver driver=new EdgeDriver();
			driver.get("https://www.facebook.com");
			WebElement element = driver.findElement(By.id("email"));
			element.sendKeys("nithya29@gmail.com");
			WebElement element2 = driver.findElement(By.name("pass"));
			element2.sendKeys("1258663");
	}
	
	@Test
	public void buyProduct() {
		s.assertTrue(false, "BUYPRODUCT");
		System.out.println("buyproduct");
		 WebDriver driver=new EdgeDriver();
			driver.get("https://www.facebook.com");
			WebElement element = driver.findElement(By.id("email"));
			element.sendKeys("nithya29@gmail.com");
			WebElement element2 = driver.findElement(By.name("pass"));
			element2.sendKeys("1258663");
	}
	
	@Test
	public void signOut() {
		s.assertTrue(true, "SIGNOUT");
		System.out.println("signout");
		 WebDriver driver=new EdgeDriver();
			driver.get("https://www.facebook.com");
			WebElement element = driver.findElement(By.id("email"));
			element.sendKeys("nithya29@gmail.com");
			WebElement element2 = driver.findElement(By.name("pass"));
			element2.sendKeys("1258663");
	}
	

}
