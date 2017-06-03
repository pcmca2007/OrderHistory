package com.was.rest;

public class TsoOptions extends Options {
	
	public String getStore_id() {
		return store_id;
	}

	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}

	private String store_id;
	
	private String store_label;
	
	private int order_id;
	
	private String status;
	
	private double total;
	
	private String description;
	
	private int tracking_num;

	private String lineItemCount;
	
	private String tracking_href;

	private String submitted_date;
	
	private int sort_date;
	
	private String detail_url;

	public String getStore_label() {
		return store_label;
	}

	public void setStore_label(String store_label) {
		this.store_label = store_label;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getTracking_num() {
		return tracking_num;
	}

	public void setTracking_num(int tracking_num) {
		this.tracking_num = tracking_num;
	}

	public String getLineItemCount() {
		return lineItemCount;
	}

	public void setLineItemCount(String lineItemCount) {
		this.lineItemCount = lineItemCount;
	}

	public String getTracking_href() {
		return tracking_href;
	}

	public void setTracking_href(String tracking_href) {
		this.tracking_href = tracking_href;
	}

	public String getSubmitted_date() {
		return submitted_date;
	}

	public void setSubmitted_date(String submitted_date) {
		this.submitted_date = submitted_date;
	}

	public int getSort_date() {
		return sort_date;
	}

	public void setSort_date(int sort_date) {
		this.sort_date = sort_date;
	}

	public String getDetail_url() {
		return detail_url;
	}

	public void setDetail_url(String detail_url) {
		this.detail_url = detail_url;
	}


}
