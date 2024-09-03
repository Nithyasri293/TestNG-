package com.test1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends GlobalClass {
	public Pojo() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="email")
	private WebElement userName;
	
	@FindBys({
		@FindBy(name="pass"),
		@FindBy(xpath="//input[@type='password']")
	})
	private WebElement passWord;
	
	@FindAll({
		@FindBy(name="login"),
		@FindBy(xpath="name")
	})
	private WebElement login;
	
	
	public WebElement getPassWord() {
		return passWord;
	}

	
	public WebElement getUserName() {
		return userName;
	}
	
	
	public WebElement getLogin() {
		return login;
	}
	
	
	


}
