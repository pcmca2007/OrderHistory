package com.was.rest.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.was.rest.AdaptedItemOptions;
import com.was.rest.ItemOptions;

public class ItemAdapter extends XmlAdapter<AdaptedItemOptions, ItemOptions> {

	@Override
	public ItemOptions unmarshal(AdaptedItemOptions v) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdaptedItemOptions marshal(ItemOptions v) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
