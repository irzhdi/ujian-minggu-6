package com.juaracoding.ujianm6.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.ujianm6.drivers.DriverSingleton;

public class CompareProduct {

	private WebDriver driver;
	
	public CompareProduct() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
}
