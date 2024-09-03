package com.test;

import org.testng.annotations.Test;

public class NewTest2 {
	@Test(priority = -35,enabled=false)
	  public void tc11() {
		System.out.println("TC 11");

	}
	  
	  @Test(priority = 36,enabled=true)
	  public void tc21() {
		System.out.println("TC 21");

	}
	  @Test(priority = 25,enabled=true)
	  public void tc31() {
		System.out.println("TC 31");

	}
}
