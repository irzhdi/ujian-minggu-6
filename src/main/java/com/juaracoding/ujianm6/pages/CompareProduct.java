package com.juaracoding.ujianm6.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.ujianm6.drivers.DriverSingleton;

public class CompareProduct {

	private WebDriver driver;
	
	public CompareProduct() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@class=\"woocommerce-MyAccount-navigation\"]/ul/li")
	List<WebElement>Dashboard;
	
	@FindBy(css = "#post-8 > div > div > div > div.woocommerce-message.woocommerce-message--info.woocommerce-Message.woocommerce-Message--info.woocommerce-info > a")
	WebElement Browse;
	
	@FindBy(css = "#noo-site > header > div.navbar-wrapper > div > div > div > div > a > img")
	WebElement logoHome;
	
	@FindBy(css = "#noo-site > div.page_fullwidth > div:nth-child(3) > div > div.padding-stylebox.wpb_column.vc_column_container.vc_col-sm-12.vc_col-lg-7.vc_col-md-7.vc_hidden-sm > div > div > div > div.noo-sh-product-grid.woocommerce > div.noo-sh-product-html.columns_3.no_masonry.three.row.is-flex > div.noo-product-item.noo-product-sm-4.not_featured.post-1497.product.type-product.status-publish.has-post-thumbnail.product_cat-t-shirt.product_tag-t-shirt.product_tag-women.has-featured.first.instock.shipping-taxable.purchasable.product-type-variable > div > h3 > a")
	WebElement Product1;
	
	@FindBy(id = "pa_color")
	WebElement ListColor1;
	
	@FindBy(xpath = "//*[@id='pa_color']/option")
	List<WebElement>OptionColor1;
	
	@FindBy(id = "pa_size")
	WebElement ListSize1;
	
	@FindBy(xpath = "//*[@id='pa_size']/option")
	List<WebElement>OptionSize1;
	
	@FindBy(css = "#noo-site > div.page_fullwidth > div:nth-child(3) > div > div.padding-stylebox.wpb_column.vc_column_container.vc_col-sm-12.vc_col-lg-7.vc_col-md-7.vc_hidden-sm > div > div > div > div.noo-sh-product-grid.woocommerce > div.noo-sh-product-html.columns_3.no_masonry.three.row.is-flex > div.noo-product-item.noo-product-sm-4.not_featured.post-1491.product.type-product.status-publish.has-post-thumbnail.product_cat-t-shirt.product_tag-t-shirt.product_tag-women.has-featured.instock.shipping-taxable.purchasable.product-type-variable > div > h3 > a")
	WebElement Product2;
	
	@FindBy(id = "pa_color")
	WebElement ListColor2;

	@FindBy(xpath = "//*[@id='pa_color']/option")
	List<WebElement>OptionColor2;

	@FindBy(id = "pa_size")
	WebElement ListSize2;
	
	@FindBy(xpath = "//*[@id='pa_size']/option")
	List<WebElement>OptionSize2;
	
	@FindBy(css = "#product-1497 > div.single-product-content > div.summary.entry-summary > form > div > div.woocommerce-variation-add-to-cart.variations_button.woocommerce-variation-add-to-cart-enabled > button")
	WebElement AddtoCart;
	
	@FindBy(id = "nav-menu-item-cart")
	WebElement Cart;
	
	@FindBy(css = "#post-6 > div > div > div.cart-collaterals > div.cart_totals > div > a")
	WebElement CheckOut;
	
	@FindBy(id = "billing_first_name")
	WebElement FirstName;
	
	@FindBy(id = "billing_last_name")
	WebElement LastName;
	
	@FindBy(id = "billing_company")
	WebElement Company;
	
	@FindBy(css = "#select2-billing_country-container")
	WebElement ListCountry;
	
	@FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
	WebElement InputCountry;
	
	@FindBy(id = "billing_address_1")
	WebElement Address1;
	
	@FindBy(id = "billing_address_2")
	WebElement Address2;
	
	@FindBy(id = "billing_city")
	WebElement City;
	
	@FindBy(css = "#select2-billing_state-container")
	WebElement ListState;
	
	@FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
	WebElement InputState;
	
	@FindBy(id = "billing_postcode")
	WebElement PostCode;
	
	@FindBy(id = "billing_phone")
	WebElement Phone;
	
	@FindBy(id = "billing_email")
	WebElement Email;
	
	@FindBy(id = "order_comments")
	WebElement Comment;
	
	@FindBy(id = "terms")
	WebElement Terms;
	
	@FindBy(id = "place_order")
	WebElement Order;
	
	public void Order(int das, int col1, int siz1, int col2, int siz2) {
	
		Dashboard.get(das).click();
		Browse.click();
	tunggu();
	JavascriptExecutor je = (JavascriptExecutor) driver;
	je.executeScript("window.scrollBy(0, 1000)");
	Product1.click();
	je.executeScript("window.scrollBy(0, 1000)");
	tunggu();
	ListColor1.click();
	OptionColor1.get(col1).click();
	ListSize1.click();
	OptionSize1.get(siz1).click();
	AddtoCart.click();
	tunggu();
		logoHome.click();
		tunggu();
		je.executeScript("window.scrollBy(0, 1000)");
		Product2.click();
		je.executeScript("window.scrollBy(0, 1000)");
		tunggu();
		ListColor2.click();
		OptionColor2.get(col2).click();
		ListSize2.click();
		OptionSize2.get(siz2).click();
		AddtoCart.click();
		tunggu();
			logoHome.click();
			tunggu();
	
	}
	
	public static void tunggu() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
