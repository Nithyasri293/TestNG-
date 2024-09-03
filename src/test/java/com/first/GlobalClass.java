package com.first;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GlobalClass {
	 
	static WebDriver driver;
	
	public static void browserLaunch() {
		driver=new ChromeDriver();

	}
	
	public static void urlLaunch(String url) {
		
		driver.get(url);
	
	}
	
	public static void fillText(WebElement e,String value) {
	  e.sendKeys(value);
   
	}
    
	public static void click(WebElement e) {
		e.click();

	}
}
