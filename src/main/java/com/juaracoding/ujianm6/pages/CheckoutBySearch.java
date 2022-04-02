package com.juaracoding.ujianm6.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.ujianm6.drivers.DriverSingleton;

public class CheckoutBySearch {
	
private WebDriver driver;

	
	public CheckoutBySearch() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@alt='ToolsQA Demo Site']")
	WebElement clickHome;
	
	@FindBy(linkText = "Search")
	WebElement clickSearch;
	
	@FindBy(name = "s")
	WebElement inputSearch;	
	
	@FindBy(css = ".form-horizontal")
	WebElement submitSearch;
	
	
	@FindBy(id = "pa_color")
	WebElement pilihWarna;
	
	@FindBy(id = "pa_size")
	WebElement pilihSize;
	
	@FindBy(xpath = "//div[@id='product-1491']/div/div[2]/form/div/div[2]/div/div/button[2]/i")
	WebElement click1;
	
	@FindBy(xpath = "//div[@id='product-1491']/div/div[2]/form/div/div[2]/button")
	WebElement click2;
	
	@FindBy(linkText = "Checkout")
	WebElement clickCheckout;
	
	@FindBy(id = "billing_first_name")
	WebElement inputFirst_Name;
	
	@FindBy(id = "billing_last_name")
	WebElement inputLast_Name;
	
	@FindBy(id = "billing_company")
	WebElement inputCompany;
	
	@FindBy(id = "select2-billing_country-container")
	WebElement clickCountryContainer;
	
	@FindBy(id = "billing_address_1")
	WebElement inputAddress1;
	
	@FindBy(id = "billing_address_2")
	WebElement inputAddress2;
	
	@FindBy(id = "billing_city")
	WebElement inputCity;
	
	@FindBy(id = "select2-billing_state-container")
	WebElement clickStateContainer;
	
	@FindBy(id = "billing_postcode")
	WebElement inputPostcode;
	
	@FindBy(id = "billing_phone")
	WebElement inputPhone;
	
	@FindBy(id = "order_comments")
	WebElement inputComments;
	
	@FindBy(id = "terms")
	WebElement clickTerms;
	
	@FindBy(id = "terms")
	WebElement clickPlaceOrder;
	
	@FindBy(xpath = "//article[@id='post-7']/div/div/div/p")
	WebElement txtThankYou;
	
	public void submitSearch() {
		String search = "playboy";
		String first_name = "Alif"; 
		String last_name = "Zuhdi"; 
		String company = "JuaraCoding"; 
		String address_1 = "Jalan Badak 20"; 
		String address_2 = "House City 69"; 
		String city = "Bekasi";
		String postcode = "17117";
		String phone = "081321037517"; 
		String comments = "test order";
			clickHome.click();
			clickSearch.click();
			inputSearch.sendKeys(search);
			submitSearch.submit();
			pilihWarna.click();
			new Select(pilihWarna).selectByVisibleText("Grey");
			pilihSize.click();
			new Select(pilihSize).selectByVisibleText("40");
			click1.click();
			click2.click();
			clickCheckout.click();
			inputFirst_Name.sendKeys(first_name);
			inputLast_Name.sendKeys(last_name);
			inputCompany.sendKeys(company);
			clickCountryContainer.click();
			inputAddress1.sendKeys(address_1);
			inputAddress2.sendKeys(address_2);
			inputCity.sendKeys(city);
			clickStateContainer.click();
			inputPostcode.sendKeys(postcode);
			inputPhone.sendKeys(phone);
			inputComments.click();
			inputComments.clear();
			inputComments.sendKeys(comments);
			
			clickTerms.click();
			clickTerms.click();
		
			clickPlaceOrder.click();
		
			
			
	}
	
	public String getTxtThankYou() {
		return txtThankYou.getText();
	}
	public static void tunggu() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
