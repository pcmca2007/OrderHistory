package com.was.rest;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name="order_details")
public class OrderDetalis {
	
	TotalOrderOptions order_totals = new TotalOrderOptions();
	BillingOptions billing_info = new BillingOptions();
	ShippingOptions shipping_info = new ShippingOptions();
	private List<ItemOptions> order_item = new ArrayList<ItemOptions>();
	
	
	@XmlJavaTypeAdapter(TotalOptionsAdapter.class)
	public TotalOrderOptions getOrder_totals() {
		return order_totals;
	}

	public void setOrder_totals(TotalOrderOptions order_totals) {
		this.order_totals = order_totals;
	}	
	
	@XmlJavaTypeAdapter(ShippingOptionsAdapter.class)
	public ShippingOptions getShipping_info() {
		return shipping_info;
	}

	@XmlJavaTypeAdapter(BillingOptionsAdapter.class)
	public BillingOptions getBilling_info() {
		return billing_info;
	}

	public void setBilling_info(BillingOptions billing_info) {
		this.billing_info = billing_info;
	}

	@XmlJavaTypeAdapter(ItemOptionsAdapter.class)
	public List<ItemOptions> getOrder_item() {
		return order_item;
	}

	public void setOrder_item(List<ItemOptions> order_item) {
		this.order_item = order_item;
	}

	public void setShipping_info(ShippingOptions shipping_info) {
		this.shipping_info = shipping_info;
	}
	
	

}
