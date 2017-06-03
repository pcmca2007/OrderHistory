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
		}else{
				SsoOptions options = (SsoOptions) v;
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
		
		return adaptedOptions;
	}

}
