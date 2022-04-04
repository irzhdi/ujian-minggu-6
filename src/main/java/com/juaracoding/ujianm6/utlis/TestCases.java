package com.juaracoding.ujianm6.utlis;

public enum TestCases {
	
	T1("Testing Login Customer"),
	T2("Testing Checkout by Search Customer"),
	T3("Testing Shopping pada shop demoqa");
	
	private String testName;
	
	TestCases(String value){
		this.testName = value;
	}
	public String getTestName() {
		return testName;
	}
}
