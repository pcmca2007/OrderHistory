package com.was.rest;

import javax.xml.bind.annotation.XmlAttribute;

public abstract class ItemOptions {
	
	private String billing_info;
	private String shipping_info;
	
	
	@XmlAttribute
	public String getBilling_info() {
		return billing_info;
	}
	public void setBilling_info(String billing_info) {
		this.billing_info = billing_info;
	}
	
	@XmlAttribute
	public String getShipping_info() {
		return shipping_info;
	}
	public void setShipping_info(String shipping_info) {
		this.shipping_info = shipping_info;
	}
	
	
	

}
