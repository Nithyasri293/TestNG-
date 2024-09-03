package com.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Student extends GlobalClass {
	
    @Parameters({"Email","Pass"})
    @Test
	public static void launch(@Optional("nithya@gmail.com")String email,String pass) {
		browserLaunch();
		urlLaunch("https://www.facebook.com");
		WebElement username = driver.findElement(By.id("email"));
		fillText(username, email);
		WebElement password = driver.findElement(By.name("pass"));
		fillText(password, pass);
		WebElement login = driver.findElement(By.name("login"));
		click(login);
		System.out.println("Done...");
	}
}
