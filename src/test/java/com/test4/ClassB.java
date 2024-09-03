package com.test4;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class ClassB {
	
	@Test
	private void tc1() {
		System.out.println("Test 1");
	}

	// tc2 depends on tc3
	@Test(alwaysRun=true)
	private void tc2() {
		System.out.println("Test 2");
	}

	@Test
	private void tc3() {
		Assert.assertTrue("failure", false);
		System.out.println("Test 3");
	}


}
