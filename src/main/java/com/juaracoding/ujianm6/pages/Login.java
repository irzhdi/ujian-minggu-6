package com.juaracoding.ujianm6.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.ujianm6.drivers.DriverSingleton;

public class Login {

	private WebDriver driver;
	
	public Login() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Dismiss")
	WebElement clickDismiss;
	
	@FindBy(linkText = "My Account")
	WebElement clickMyAccount;
	
	@FindBy(id = "username")
	WebElement inputUsername;	
	
	@FindBy(id = "password")
	WebElement inputPassword;
	
	@FindBy(name = "login")
	WebElement btnLogin;
	
	@FindBy(xpath = "//article[@id='post-8']/div/div/div/p/strong")
	WebElement txtNamaUser;
	
	public void submitLogin(String user, String password) {
		clickDismiss.click();
		clickMyAccount.click();
		inputUsername.sendKeys(user);
		inputPassword.sendKeys(password);
		btnLogin.click();
	}
	
	public String getTxtNamaUser() {
		return txtNamaUser.getText();
	}
	
}
