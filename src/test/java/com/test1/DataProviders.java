package com.test1;

import org.testng.annotations.DataProvider;

import com.first.GlobalClass;

public class DataProviders extends GlobalClass {
	
	@DataProvider(name="data")
	public Object[][] datas() {
		return new Object[][] {
			{"nithya","125896"},
			{"sai","4569852"},
			{"sri","369852"}
		};

	}
	

}
