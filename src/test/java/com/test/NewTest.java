package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	 @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Before Method");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("After Method");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("Before Class");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("After Class");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("Before Test");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("After Test");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("Before Suite");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("After Suite");
	  }
	  
	  @Test(priority = -35,enabled=false)
	  public void tc1() {
		System.out.println("TC 1");

	}
	  
	  @Test(priority = 35,enabled=true)
	  public void tc2() {
		System.out.println("TC 2");

	}
	  @Test(priority = 25,enabled=true)
	  public void tc3() {
		System.out.println("TC 3");

	}
	  @Test(priority = 85,enabled=true,invocationCount = 3)
	  public void tc4() {
		System.out.println("TC 4");

	}
	  @Test(priority = -15,enabled=false)
	  public void tc5() {
		System.out.println("TC 5");

	}
	  @Test(priority = 55,enabled=true)
	  public void tc6() {
		System.out.println("TC 6");

	}




}
