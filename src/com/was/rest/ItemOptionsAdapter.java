package com.was.rest;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class ItemOptionsAdapter extends XmlAdapter<AdaptedItemOptions,ItemOptions> {

	@Override
	public ItemOptions unmarshal(AdaptedItemOptions v) throws Exception {
		
		if("SCHOOL".trim().equals(v.shipping_info) && "".equals(v.billing_info)){
			
			SsoOrderItemOptions options = new SsoOrderItemOptions();
			options.setOrder_item_id(v.map.get("order_item_id"));
			options.setTitle(v.map.get("title"));
			options.setNickname(v.map.get("nickname"));
			options.setShipping_amt(v.map.get("shipping_amt"));
			options.setIsbn(v.map.get("isbn"));
			options.setPartNum(v.map.get("partNum"));
			options.setQuantity(v.map.get("quantity"));
			options.setList_price(v.map.get("list_price"));
			options.setTax_dollar_amt(v.map.get("tax_dollar_amt"));
			options.setTotal_items_price(v.map.get("total_items_price"));
			options.setItem_adjust(v.map.get("item_adjust"));
			options.setItem_image(v.map.get("item_image"));
			options.setProduct_type(v.map.get("product_type"));
			options.setTracking_href(v.map.get("tracking_href"));
			
			return options; 
			
		}else {
			
			TsoOrderItemOptions options = new TsoOrderItemOptions();
			options.setOrder_item_id(v.map.get("order_item_id"));
			options.setTitle(v.map.get("title"));
			options.setNickname(v.map.get("nickname"));
			options.setShipping_amt(v.map.get("shipping_amt"));
			options.setIsbn(v.map.get("isbn"));
			options.setPartNum(v.map.get("partNum"));
			options.setQuantity(v.map.get("quantity"));
			options.setList_price(v.map.get("list_price"));
			options.setTax_dollar_amt(v.map.get("tax_dollar_amt"));
			options.setTotal_items_price(v.map.get("total_items_price"));
			options.setItem_adjust(v.map.get("item_adjust"));
			options.setItem_image(v.map.get("item_image"));
			options.setProduct_type(v.map.get("product_type"));
			options.setTracking_href(v.map.get("tracking_href"));
			
			return options;
			
		}
		
		
	}

	@Override
	public AdaptedItemOptions marshal(ItemOptions v) throws Exception {
		
		AdaptedItemOptions adaptedOptions = new AdaptedItemOptions();
		adaptedOptions.setBilling_info("");
		adaptedOptions.setShipping_info(v.getShipping_info());
		
		if(SsoOrderItemOptions.class.equals(v.getClass())){
			
			SsoOrderItemOptions options = (SsoOrderItemOptions) v;
			adaptedOptions.map.put("order_item_id", String.valueOf(options.getOrder_item_id()));
			adaptedOptions.map.put("title", String.valueOf(options.getTitle()));
			adaptedOptions.map.put("nickname", String.valueOf(options.getNickname()));
			adaptedOptions.map.put("shipping_amt", String.valueOf(options.getShipping_amt()));
			adaptedOptions.map.put("isbn", String.valueOf(options.getIsbn()));
			adaptedOptions.map.put("partNum", String.valueOf(options.getPartNum()));
			adaptedOptions.map.put("quantity", String.valueOf(options.getQuantity()));
			adaptedOptions.map.put("list_price", String.valueOf(options.getList_price()));
			adaptedOptions.map.put("tax_dollar_amt", String.valueOf(options.getTax_dollar_amt()));
			adaptedOptions.map.put("total_items_price", String.valueOf(options.getTotal_items_price()));
			adaptedOptions.map.put("item_adjust", String.valueOf(options.getItem_adjust()));
			adaptedOptions.map.put("item_image", String.valueOf(options.getItem_image()));
			adaptedOptions.map.put("product_type", String.valueOf(options.getOrder_item_id()));
			adaptedOptions.map.put("tracking_href", String.valueOf(options.getTracking_href()));
			
		}else if(TsoOrderItemOptions.class.equals(v.getClass())){
			
			TsoOrderItemOptions options = (TsoOrderItemOptions) v;
			adaptedOptions.map.put("order_item_id", String.valueOf(options.getOrder_item_id()));
			adaptedOptions.map.put("title", String.valueOf(options.getTitle()));
			adaptedOptions.map.put("nickname", String.valueOf(options.getNickname()));
			adaptedOptions.map.put("shipping_amt", String.valueOf(options.getShipping_amt()));
			adaptedOptions.map.put("isbn", String.valueOf(options.getIsbn()));
			adaptedOptions.map.put("partNum", String.valueOf(options.getPartNum()));
			adaptedOptions.map.put("quantity", String.valueOf(options.getQuantity()));
			adaptedOptions.map.put("list_price", String.valueOf(options.getList_price()));
			adaptedOptions.map.put("tax_dollar_amt", String.valueOf(options.getTax_dollar_amt()));
			adaptedOptions.map.put("total_items_price", String.valueOf(options.getTotal_items_price()));
			adaptedOptions.map.put("item_adjust", String.valueOf(options.getItem_adjust()));
			adaptedOptions.map.put("item_image", String.valueOf(options.getItem_image()));
			adaptedOptions.map.put("product_type", String.valueOf(options.getOrder_item_id()));
			adaptedOptions.map.put("tracking_href", String.valueOf(options.getTracking_href()));
			
		}
		
		
		
		return adaptedOptions; 
	}

}
