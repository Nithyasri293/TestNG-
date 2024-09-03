package com.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DpSample extends DataProviders {
	
	@Test(dataProvider = "data")
	public void tc1(String email,String pass) {
		browserLaunch();
		urlLaunch("https://www.facebook.com");
		Pojo p=new Pojo();
		WebElement userName = p.getUserName();
		WebElement passWord = p.getPassWord();
		WebElement login = p.getLogin();
		fillText(userName, email);
		fillText(passWord, pass);
		login.click();
		System.out.println("Done.....I am completed.");

	}

}
