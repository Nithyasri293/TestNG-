package com.test;

import org.testng.annotations.Test;

public class NewTest3 {
	
	@Test(priority = -35,enabled=false)
	  public void tc20() {
		System.out.println("TC 21");

	}
	  
	  @Test(priority = 35,enabled=true)
	  public void tc22() {
		System.out.println("TC 22");

	}
	  @Test(priority = 25,enabled=true)
	  public void tc23() {
		System.out.println("TC 23");

	}

}
