package com.juaracoding.ujianm6.glue;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.ujianm6.config.AutomationFrameworkConfig;
import com.juaracoding.ujianm6.drivers.DriverSingleton;
import com.juaracoding.ujianm6.pages.Login;
import com.juaracoding.ujianm6.utlis.ConfigurationProperties;
import com.juaracoding.ujianm6.utlis.Constants;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfig.class)
public class StepDefinition {

	private WebDriver driver;
	private Login login;
	
	
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		login = new Login();
	
		
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
	


	
	
	public static void tunggu() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
