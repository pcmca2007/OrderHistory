package com.was.rest;

import javax.xml.bind.annotation.XmlAttribute;

public class ShippingOptions {
	
	private String name;

	@XmlAttribute
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
