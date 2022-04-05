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
	
//	@Value("${das}")
//	private int das;
	
	@Value("${col1}")
	private String col1;
	
	@Value("${siz1}")
	private String siz1;
	
	@Value("${col2}")
	private String col2;
	
	@Value("${siz2}")
	private String siz2;
	
	@Value("${fn}")
	private String fn;
	
	@Value("${ln}")
	private String ln;
	
	@Value("${comp}")
	private String comp;
	
	@Value("${coun}")
	private String coun;
	
	@Value("${add1}")
	private String add1;
	
	@Value("${add2}")
	private String add2;
	
	@Value("${cit}")
	private String cit;
	
	@Value("${stat}")
	private String stat;
	
	@Value("${cod}")
	private String cod;
	
	@Value("${phon}")
	private String phon;
	
	@Value("${em}")
	private String em;
	
//	@Value("${comm}")
//	private String comm;
	
	@Value("${txtThankYou}")
	private String txtThankYou2;
	
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
	
//	public int getDas() {
//		return das;
//	}
//
//	public void setDas(int das) {
//		this.das = das;
//	}

	public String getCol1() {
		return col1;
	}

	public void setCol1(String col1) {
		this.col1 = col1;
	}
	
	public String getSiz1() {
		return siz1;
	}

	public void setSiz1(String siz1) {
		this.siz1 = siz1;
	}
	
	public String getCol2() {
		return col2;
	}

	public void setCol2(String col2) {
		this.col2 = col2;
	}
	
	public String getSiz2() {
		return siz2;
	}

	public void setSiz2(String siz2) {
		this.siz2 = siz2;
	}
	
	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}
	
	public String getLn() {
		return ln;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}
	
	public String getComp() {
		return comp;
	}

	public void setComp(String com) {
		this.comp = comp;
	}
	
	public String getCoun() {
		return coun;
	}

	public void setCoun(String coun) {
		this.coun = coun;
	}
	
	public String getAdd1() {
		return add1;
	}

	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	
	public String getAdd2() {
		return add2;
	}

	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	
	public String getCit() {
		return cit;
	}

	public void setCit(String cit) {
		this.cit = cit;
	}
	
	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}
	
	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}
	
	public String getPhon() {
		return phon;
	}

	public void setPhon(String phon) {
		this.phon = phon;
	}
	
	public String getEm() {
		return em;
	}

	public void setEm(String em) {
		this.em = em;
	}
	
//	public String getComm() {
//		return comm;
//	}
//
//	public void setComm(String comm) {
//		this.comm = comm;
//	}
	
	public String getTxtThankYou2() {
		return txtThankYou;
	}
	
	public void setTxtThankYou2() {
		this.txtThankYou2 = txtThankYou2; 
	}
}
