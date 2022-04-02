package com.juaracoding.ujianm6.utlis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {

	@Value("${browser}")
	private String browser;
	
	@Value("${user}")
	private String user;
	
	@Value("${password}")
	private String password;
	
	@Value("${txtNamaUser}")
	private String txtNamaUser;
	
	@Value("${search}")
	private String search;
	
	@Value("${first_name}")
	private String first_name;
	
	@Value("${last_name}")
	private String last_name;
	
	@Value("${company}")
	private String company;
	
	@Value("${address_1}")
	private String address_1;
	
	@Value("${address_2}")
	private String address_2;
	
	@Value("${city}")
	private String city;
	
	@Value("${postcode}")
	private String postcode;
	
	@Value("${phone}")
	private String phone;
	
	@Value("${comments}")
	private String comments;
	
	@Value("${txtThankYou}")
	private String txtThankYou;
	
//=====================================================
	
	public String getBrowser() {
		return browser;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

	public String getTxtNamaUser() {
		return txtNamaUser;
	}
	public String getSearch() {
		return search;
	}
	public String getFirst_name() {
		return first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public String getCompany() {
		return company;
	}
	public String getAddress_1() {
		return address_1;
	}
	public String getAddress_2() {
		return address_2;
	}
	public String getCity() {
		return city;
	}
	public String getPostcode() {
		return postcode;
	}
	public String getPhone() {
		return phone;
	}
	public String getComments() {
		return comments;
	}
	public String getTxtThankYou() {
		return txtThankYou;
	}
}
