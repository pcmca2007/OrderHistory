package com.was.rest;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class ShippingOptionsAdapter extends XmlAdapter<ShippingAdaptedOptions, ShippingOptions> {

	@Override
	public ShippingOptions unmarshal(ShippingAdaptedOptions v) throws Exception {
		
		if("83268518".trim().equals(v.name)){
			
			
			ShippingInfoTOptions options = new ShippingInfoTOptions();
			
			//options.setName(v.getName());
			options.setName(v.map.get("name"));
			options.setAddress1(v.map.get("address1"));
			options.setAddress1(v.map.get("address2"));
			options.setCity(v.map.get("city"));
			options.setState(v.map.get("state"));
			options.setZip(v.map.get("zip"));
			options.setShip_type(v.map.get("ship_type"));
			
			return options;
							
		}else{
			
			ShippingInfoSOptions options = new ShippingInfoSOptions();
			
			//options.setName(v.getName());
			options.setName(v.map.get("name"));
			options.setAddress1(v.map.get("address1"));
			options.setAddress1(v.map.get("address2"));
			options.setCity(v.map.get("city"));
			options.setState(v.map.get("state"));
			options.setZip(v.map.get("zip"));
			options.setShip_type(v.map.get("ship_type"));
			
			return options;
			
		}
		
		
	}

	@Override
	public ShippingAdaptedOptions marshal(ShippingOptions v) throws Exception {
		
		ShippingAdaptedOptions shippingOptions = new ShippingAdaptedOptions();
		
		if(ShippingInfoTOptions.class.equals(v.getClass())){
			
			ShippingInfoTOptions options = (ShippingInfoTOptions) v;
			shippingOptions.setName("83268518");
			shippingOptions.map.put("name", String.valueOf(options.getName()));
			shippingOptions.map.put("address1", String.valueOf(options.getAddress1()));
			shippingOptions.map.put("address2", String.valueOf(options.getAddress2()));
			shippingOptions.map.put("city", String.valueOf(options.getCity()));
			shippingOptions.map.put("zip", String.valueOf(options.getZip()));
			shippingOptions.map.put("ship_type", String.valueOf(options.getShip_type()));
			
		}else if(ShippingInfoSOptions.class.equals(v.getClass())){
			
			ShippingInfoSOptions options = (ShippingInfoSOptions) v;
			shippingOptions.setName("SCHOOL");
			shippingOptions.map.put("name", String.valueOf(options.getName()));
			shippingOptions.map.put("address1", String.valueOf(options.getAddress1()));
			shippingOptions.map.put("address2", String.valueOf(options.getAddress2()));
			shippingOptions.map.put("city", String.valueOf(options.getCity()));
			shippingOptions.map.put("zip", String.valueOf(options.getZip()));
			shippingOptions.map.put("ship_type", String.valueOf(options.getShip_type()));
			
		}
		
		
		return shippingOptions;
	}

	

}
