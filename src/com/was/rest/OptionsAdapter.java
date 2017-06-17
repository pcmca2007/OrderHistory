package com.was.rest;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class OptionsAdapter extends XmlAdapter<AdaptedOptions, Options> {

	@Override
	public Options unmarshal(AdaptedOptions v) throws Exception {
		
		if("TSO".equals(v.store_id)){
			
			TsoOptions options = new TsoOptions();
			System.out.println("XXXXXXXXXXXXXXXX="+v.getStore_id());
			options.setStore_id(v.getStore_id());
			options.setStore_label(v.map.get("store_label"));
			options.setOrder_id(Integer.valueOf(v.map.get("order_id")));
			options.setStatus(v.map.get("status"));
			options.setTotal(Integer.valueOf(v.map.get("total")));
			options.setDescription(v.map.get("description"));
			options.setTracking_href(v.map.get("description"));
			options.setLineItemCount(v.map.get("lineItemCount"));
			options.setTracking_href(v.map.get("tracking_href"));
			options.setSubmitted_date(v.map.get("submitted_date"));
			options.setSort_date(Integer.valueOf(v.map.get("submitted_date")));
			options.setDetail_url(v.map.get("detail_url"));
			
			return options; 
			
		}else{
			
			SsoOptions options = new SsoOptions();
			options.setStore_id(v.getStore_id());
			System.out.println("YYYYYYYYYYYYYYYYYYY="+v.getStore_id());
			options.setStore_label(v.map.get("store_label"));
			options.setOrder_id(Integer.valueOf(v.map.get("order_id")));
			options.setStatus(v.map.get("status"));
			options.setTotal(Integer.valueOf(v.map.get("total")));
			options.setDescription(v.map.get("description"));
			options.setTracking_href(v.map.get("description"));
			options.setLineItemCount(v.map.get("lineItemCount"));
			options.setTracking_href(v.map.get("tracking_href"));
			options.setSubmitted_date(v.map.get("submitted_date"));
			options.setSort_date(Integer.valueOf(v.map.get("submitted_date")));
			options.setDetail_url(v.map.get("detail_url"));
			
			return options;
		}
		
		
	}

	@Override
	public AdaptedOptions marshal(Options v) throws Exception {
		
		AdaptedOptions adaptedOptions = new AdaptedOptions();
		adaptedOptions.setStore_id(v.getStore_id());
		
		if(TsoOptions.class.equals(v.getClass())){
			
			TsoOptions options = (TsoOptions) v;
			
			adaptedOptions.map.put("store_label", String.valueOf(options.getStore_label()));
			adaptedOptions.map.put("order_id", String.valueOf(options.getOrder_id()));
			adaptedOptions.map.put("status", String.valueOf(options.getStatus()));
			adaptedOptions.map.put("total", String.valueOf(options.getTotal()));
			adaptedOptions.map.put("description", String.valueOf(options.getDescription()));
			adaptedOptions.map.put("tracking_num", String.valueOf(options.getTracking_num()));
			adaptedOptions.map.put("lineItemCount", String.valueOf(options.getLineItemCount()));
			adaptedOptions.map.put("tracking_href", String.valueOf(options.getTracking_href()));
			adaptedOptions.map.put("submitted_date", String.valueOf(options.getSubmitted_date()));
			adaptedOptions.map.put("sort_date", String.valueOf(options.getSort_date()));
			adaptedOptions.map.put("detail_url", String.valueOf(options.getDetail_url()));
			
		}else if(SsoOptions.class.equals(v.getClass())){
				SsoOptions options = (SsoOptions) v;
				//adaptedOptions.setStore_id(v.getStore_id());
				adaptedOptions.map.put("store_label", String.valueOf(options.getStore_label()));
				adaptedOptions.map.put("order_id", String.valueOf(options.getOrder_id()));
				adaptedOptions.map.put("status", String.valueOf(options.getStatus()));
				adaptedOptions.map.put("total", String.valueOf(options.getTotal()));
				adaptedOptions.map.put("description", String.valueOf(options.getDescription()));
				adaptedOptions.map.put("tracking_num", String.valueOf(options.getTracking_num()));
				adaptedOptions.map.put("lineItemCount", String.valueOf(options.getLineItemCount()));
				adaptedOptions.map.put("tracking_href", String.valueOf(options.getTracking_href()));
				adaptedOptions.map.put("submitted_date", String.valueOf(options.getSubmitted_date()));
				adaptedOptions.map.put("sort_date", String.valueOf(options.getSort_date()));
				adaptedOptions.map.put("detail_url", String.valueOf(options.getDetail_url()));
			
		}
		/*else if(ShippingInfoSOptions.class.equals(v.getClass())){
			
			ShippingInfoSOptions options = (ShippingInfoSOptions) v;
			
			adaptedOptions.map.put("name", String.valueOf(options.getName()));
			adaptedOptions.map.put("address1", String.valueOf(options.getAddress1()));
			adaptedOptions.map.put("address2", String.valueOf(options.getAddress2()));
			adaptedOptions.map.put("city", String.valueOf(options.getCity()));
			adaptedOptions.map.put("state", String.valueOf(options.getState()));
			adaptedOptions.map.put("zip", String.valueOf(options.getZip()));
			adaptedOptions.map.put("ship_to_phone", String.valueOf(options.getShip_to_phone()));
			adaptedOptions.map.put("ship_type", String.valueOf(options.getShip_type()));
				
		}else if(ShippingInfoTOptions.class.equals(v.getClass())){
			
			ShippingInfoTOptions options = (ShippingInfoTOptions) v;
			
			adaptedOptions.map.put("name", String.valueOf(options.getName()));
			adaptedOptions.map.put("address1", String.valueOf(options.getAddress1()));
			adaptedOptions.map.put("address2", String.valueOf(options.getAddress2()));
			adaptedOptions.map.put("city", String.valueOf(options.getCity()));
			adaptedOptions.map.put("state", String.valueOf(options.getState()));
			adaptedOptions.map.put("zip", String.valueOf(options.getZip()));
			adaptedOptions.map.put("ship_type", String.valueOf(options.getShip_type()));
						
		}else if(BillingInfoOptions.class.equals(v.getClass())){
			
			BillingInfoOptions options = (BillingInfoOptions) v;
			
			adaptedOptions.map.put("name", String.valueOf(options.getName()));
			adaptedOptions.map.put("address1", String.valueOf(options.getAddress1()));
			adaptedOptions.map.put("address2", String.valueOf(options.getAddress2()));
			adaptedOptions.map.put("city", String.valueOf(options.getCity()));
			adaptedOptions.map.put("state", String.valueOf(options.getState()));
			adaptedOptions.map.put("zip", String.valueOf(options.getZip()));
			adaptedOptions.map.put("bill_to_phone", String.valueOf(options.getBill_to_phone()));
			adaptedOptions.map.put("bill_to_email", String.valueOf(options.getBill_to_email()));
			adaptedOptions.map.put("card_brand", String.valueOf(options.getCard_brand()));
			adaptedOptions.map.put("card_number", String.valueOf(options.getCard_number()));
			
		}else if(TotalOrderOptions.class.equals(v.getClass())){
			
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
			
		} else if(OrderItemOptions.class.equals(v.getClass())){
			
			OrderItemOptions options = (OrderItemOptions) v;
			
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
		}*/
		
		return adaptedOptions;
	}

}
