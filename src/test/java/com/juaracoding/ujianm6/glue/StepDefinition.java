package com.juaracoding.ujianm6.glue;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.ujianm6.config.AutomationFrameworkConfig;
import com.juaracoding.ujianm6.drivers.DriverSingleton;
import com.juaracoding.ujianm6.pages.CheckoutBySearch;
import com.juaracoding.ujianm6.pages.CompareProduct;
import com.juaracoding.ujianm6.pages.Login;
import com.juaracoding.ujianm6.utlis.ConfigurationProperties;
import com.juaracoding.ujianm6.utlis.Constants;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfig.class)
public class StepDefinition {

	private WebDriver driver;
	private Login login;
	private CheckoutBySearch checkoutBySearch;
	private CompareProduct compareProduct;
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		login = new Login();
		//checkoutBySearch = new CheckoutBySearch();
		compareProduct  = new CompareProduct();
		
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
	@Given("Customer mengakses url")
	public void customer_mengakses_url() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
	}
	
	@When("Customer klik login button")
	public void customer_klik_login_button() {
		login.submitLogin(configurationProperties.getUser(),configurationProperties.getPassword());
	}
	
	@Then("Customer berhasil login")
	public void customer_berhasil_login() {
	
		driver.navigate().refresh();
		tunggu();
		assertEquals(configurationProperties.getTxtNamaUser(), login.getTxtNamaUser());
	}
	@When("Customer search product")
	public void customer_search_product() {
		checkoutBySearch.submitSearch();
		
	}
	@Then("Customer berhasil checkout")
	public void customer_berhasil_checkout() {
		tunggu();
		assertEquals(configurationProperties.getTxtThankYou(), checkoutBySearch.getTxtThankYou());
	}
	
	@When("Customer klik menu dashboard shop demoqa")
		public void Customer_klik_menu_dashboard_shop_demoqa() {
	tunggu();
		compareProduct.Order(configurationProperties.getDas(), configurationProperties.getCol1(), configurationProperties.getSiz1(), configurationProperties.getCol2(), configurationProperties.getSiz2());	
		}
	
	@And("Customer memilih product")
	public void Customer_memilih_product() {
		tunggu();
		compareProduct.submitSearch(configurationProperties.getFn(), configurationProperties.getLn(), configurationProperties.getComp(), configurationProperties.getCoun(), configurationProperties.getAdd1(), configurationProperties.getAdd2(), configurationProperties.getCit(), configurationProperties.getStat(), configurationProperties.getCod(), configurationProperties.getPhon(), configurationProperties.getEm(), configurationProperties.getComm());
	}
	
	@Then("Customer berhasil membeli product")
	public void customer_berhasil_membeli_product() {
		tunggu();
		assertEquals(configurationProperties.getTxtThankYou2(), compareProduct.getTxtThankYou2());
	}
	
	public static void tunggu() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
