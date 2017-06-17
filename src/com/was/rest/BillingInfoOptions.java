package com.was.rest;

public class BillingInfoOptions extends BillingOptions {
	
	
	private String name;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zip;
	private String bill_to_phone;
	private String bill_to_email;
	private String card_brand;
	private String card_number;
	
	
	
	public String getCard_number() {
		return card_number;
	}
	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getBill_to_phone() {
		return bill_to_phone;
	}
	public void setBill_to_phone(String bill_to_phone) {
		this.bill_to_phone = bill_to_phone;
	}
	public String getBill_to_email() {
		return bill_to_email;
	}
	public void setBill_to_email(String bill_to_email) {
		this.bill_to_email = bill_to_email;
	}
	public String getCard_brand() {
		return card_brand;
	}
	public void setCard_brand(String card_brand) {
		this.card_brand = card_brand;
	}
	
	
	
 
} 
