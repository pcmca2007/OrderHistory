package com.was.rest;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class BillingOptionsAdapter extends XmlAdapter<BillingAdaptedOptions,BillingOptions> {

	@Override
	public BillingOptions unmarshal(BillingAdaptedOptions v) throws Exception {
		
		BillingInfoOptions options = new BillingInfoOptions();
		options.setName(v.map.get("name"));
		options.setAddress1(v.map.get("address1"));
		options.setAddress2(v.map.get("address2"));
		options.setCity(v.map.get("city"));
		options.setState(v.map.get("state"));
		options.setZip(v.map.get("zip"));
		options.setBill_to_phone(v.map.get("bill_to_phone"));
		options.setBill_to_email(v.map.get("bill_to_email"));
		options.setCard_brand(v.map.get("card_brand"));
		options.setCard_number(v.map.get("card_number"));
		
		
		return options;
	}

	@Override
	public BillingAdaptedOptions marshal(BillingOptions v) throws Exception {
			
		BillingAdaptedOptions adaptedOptions = new BillingAdaptedOptions();
		adaptedOptions.setName("");
		
			if(BillingInfoOptions.class.equals(v.getClass())){
				
				BillingInfoOptions options = (BillingInfoOptions) v;
				adaptedOptions.map.put("name",String.valueOf(options.getName()));
				adaptedOptions.map.put("address1", String.valueOf(options.getAddress1()));
				adaptedOptions.map.put("address2", String.valueOf(options.getAddress2()));
				adaptedOptions.map.put("city", String.valueOf(options.getCity()));
				adaptedOptions.map.put("state",String.valueOf(options.getState()));
				adaptedOptions.map.put("zip", String.valueOf(options.getZip()));
				adaptedOptions.map.put("bill_to_phone", String.valueOf(options.getBill_to_phone()));
				adaptedOptions.map.put("bill_to_email", String.valueOf(options.getBill_to_email()));
				adaptedOptions.map.put("card_brand", String.valueOf(options.getCard_brand()));
				adaptedOptions.map.put("card_number", String.valueOf(options.getCard_number()));
				
			}
		return adaptedOptions;
	}

}
