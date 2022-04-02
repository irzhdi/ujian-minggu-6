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
	
	
}
