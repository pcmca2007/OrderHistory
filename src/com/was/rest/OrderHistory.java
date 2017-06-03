package com.was.rest;



import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
public class OrderHistory {
	
	
	//List<Order> orders = new ArrayList<Order>();
	private List<Options> order = new ArrayList<Options>();

	@XmlJavaTypeAdapter(OptionsAdapter.class)
	public List<Options> getOrder() {
		return order;
	}

	public void setOrder(List<Options> orders) {
		this.order = orders;
	}
	
	

}
