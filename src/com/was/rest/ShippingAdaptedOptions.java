package com.was.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlValue;



public class ShippingAdaptedOptions extends ShippingOptions {
	
	
	@XmlAttribute String name;
	
	
	@XmlElement List<Attribute> attribute  = new ArrayList<Attribute>();
	Map<String, String> map = new HashMap<String, String>();
	
	public void beforeMarshal(Marshaller marshaller) {
        for(Entry<String, String> entry : map.entrySet()) {
        	Attribute aAttribute = new Attribute();
        	aAttribute.name = entry.getKey();
        	aAttribute.value = entry.getValue();
            attribute.add(aAttribute);
        }
    }

    public void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
        for(Attribute aAttribute : attribute) {
            map.put(aAttribute.name, aAttribute.value);
        }
    }
	
	
	private static class Attribute  {
        @XmlAttribute String name;
        @XmlValue String value;
    }


}
