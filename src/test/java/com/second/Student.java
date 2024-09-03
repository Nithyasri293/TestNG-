package com.second;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Student
{
	static WebDriver driver;
	
	@Test
	@Parameters("browser")
	public static void login(String browserName) {
		
		if (browserName.equals("edge")) {
			driver=new EdgeDriver();
		} 
		else if (browserName.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			driver=new ChromeDriver();
		}

			driver.get("https://www.facebook.com");
			System.out.println(driver.getTitle());
			//driver.quit();
			System.out.println("It works");
	}

}
