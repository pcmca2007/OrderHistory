package com.was.rest;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class TotalOptionsAdapter extends XmlAdapter<TotalAdaptedOptions,TotalOrderOptions> {

	@Override
	public TotalOrderOptions unmarshal(TotalAdaptedOptions v) throws Exception {
		
		TotalOrderOptions options = new TotalOrderOptions();
		options.setOrder_id(v.map.get("order_id"));
		options.setItem_total(v.map.get("item_total"));
		options.setDiscount(v.map.get("discount"));
		options.setTax_total(v.map.get("tax_total"));
		options.setGrand_total(v.map.get("grand_total"));
		options.setOrder_status(v.map.get("order_status"));
		options.setOrder_date(v.map.get("order_date"));
		options.setStore_label(v.map.get("store_label"));
		options.setDetail_url(v.map.get("detail_url"));
		options.setPromo_code(v.map.get("promo_code"));
		options.setStoreIdentifier(v.map.get("storeIdentifier"));
		
		return options;
	}

	@Override
	public TotalAdaptedOptions marshal(TotalOrderOptions v) throws Exception {
		
		TotalAdaptedOptions adaptedOptions = new TotalAdaptedOptions();
		
		if(TotalOrderOptions.class.equals(v.getClass())){
			
			TotalOrderOptions options = (TotalOrderOptions) v;
			
			adaptedOptions.map.put("order_id", String.valueOf(options.getOrder_id()));
			adaptedOptions.map.put("item_total", String.valueOf(options.getItem_total()));
			adaptedOptions.map.put("discount", String.valueOf(options.getDiscount()));
			adaptedOptions.map.put("shipping_total", String.valueOf(options.getShipping_total()));
			adaptedOptions.map.put("tax_total", String.valueOf(options.getTax_total()));
			adaptedOptions.map.put("grand_total", String.valueOf(options.getGrand_total()));
			adaptedOptions.map.put("order_status", String.valueOf(options.getOrder_status()));
			adaptedOptions.map.put("order_date", String.valueOf(options.getOrder_date()));
			adaptedOptions.map.put("store_label", String.valueOf(options.getStore_label()));
			adaptedOptions.map.put("detail_url", String.valueOf(options.getDetail_url()));
			adaptedOptions.map.put("promo_code", String.valueOf(options.getPromo_code()));
			adaptedOptions.map.put("storeIdentifier", String.valueOf(options.getStoreIdentifier()));
			
			
		}
		
		return adaptedOptions;
	}

}
