package com.test3;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	int limit=4;
	int failedCount=0;

	@Override
	public boolean retry(ITestResult arg0) {
		if (failedCount<limit) {
			failedCount++;
			return true;
		}
		return false;
	}

}
