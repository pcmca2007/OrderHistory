package com.was.rest;

import javax.xml.bind.annotation.XmlAttribute;

public abstract class Options {
	
	
	private String store_id;

	@XmlAttribute
    public String getStore_id() {
		return store_id;
	}

	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}

		
	

}
