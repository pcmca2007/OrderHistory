package com.was.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/conference")
public class ConferenceResource {
	
	private List<Conference> conferences = new ArrayList<Conference>() ;
	
	public ConferenceResource(){
		
		 conferences.add(new Conference("ISIT", "March 19-21st", "http://2017.33degree.org"));
		 conferences.add(new Conference("STAIT", "December 19-21st", "http://2017.33degree.org"));
		 conferences.add(new Conference("IILT", "August 19-21st", "http://2017.iilt.org"));
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Conference> getList(){
		
		Conference con = new Conference();
		con.setName("ISIT");
		con.setDate("March 19-21st");
		con.setUrl("http://2017.33degree.org");
		
		conferences.add(con);
		
		Conference con1 = new Conference();
		con.setName("ISIT");
		con.setDate("December 19-21st");
		con.setUrl("http://2017.33degree.org");
		
		conferences.add(con1);
		
		Conference con2 = new Conference();
		con.setName("ISIT");
		con.setDate("December 19-21st");
		con.setUrl("http://2017.33degree.org");
		
		return conferences;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("{id}")
	public String grtConferenceById(@PathParam("id") String id){
		
		return id;
	}
	
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("com")
    public OrderHistory getMessage(){
    	 
    	TsoOptions or = new TsoOptions();
    	SsoOptions or1 = new SsoOptions();
    	   	
    	List<Options> orderList = new ArrayList<Options>();
    
    	
    	or.setStore_id("TSO");
    	or.setStore_label("SSO Store");
    	or.setOrder_id(7039012);
    	or.setStatus("Shipped");
    	or.setTotal(11.76);
    	or.setDescription("Electronic order");
    	or.setTracking_num(1234);
    	or.setLineItemCount("ssolineItemCount");
    	or.setTracking_href("www.abc.com");
    	or.setSubmitted_date("11/19/2015");
    	or.setSort_date(1448316);
    	or.setDetail_url("http://localhost:9080/Conferences/resources/conference/com");
    	
    	orderList.add(or);
    	
    	or1.setStore_id("SSO");
    	or1.setStore_label("Teacher Store");
    	or1.setOrder_id(7039009);
    	or1.setStatus("Cancelled");
    	or1.setTotal(15.25);
    	or1.setDescription("Electronic order");
    	or1.setTracking_num(1234);
    	or1.setLineItemCount("tsolineItemCount");
    	or1.setTracking_href("www.abc.com");
    	or1.setSubmitted_date("11/19/2015");
    	or1.setSort_date(1448316);
    	or1.setDetail_url("http://shop.scholastic.com/webapp/wcs/stores/servlet/MyAcctItemHistoryView?langId=-1&amp;storeId=10751&amp;orderId=7039009");

    	orderList.add(or1);
    	
    	TsoOptions or2= or;
    	orderList.add(or2);
    	
    	TsoOptions or3=or2;
    	orderList.add(or3);
    	
    	SsoOptions or4=or1;
    	orderList.add(or4);
    	
    	TsoOptions or5=or2;
    	orderList.add(or5);
    	
    	SsoOptions or6=or1;
    	orderList.add(or6);
    	
    	SsoOptions or7=or1;
    	orderList.add(or7);
    	
    	SsoOptions or8=or1;
    	orderList.add(or8);
    	
    	SsoOptions or9=or1;
    	orderList.add(or9);
    	
    	SsoOptions or10=or1;
    	orderList.add(or10);
    	
    	SsoOptions or11=or1;
    	orderList.add(or11);
    	
    	SsoOptions or12=or1;
    	orderList.add(or12);
    	
    	SsoOptions or13=or1;
    	orderList.add(or13);
    	
    	SsoOptions or14=or1;
    	orderList.add(or14);
    	
    	SsoOptions or15=or1;
    	orderList.add(or15);
    	
    	SsoOptions or16=or1;
    	orderList.add(or16);
    	
    	SsoOptions or17=or1;
    	orderList.add(or17);
    	
    	SsoOptions or18=or1;
    	orderList.add(or18);
    	
    	SsoOptions or19=or1;
    	orderList.add(or19);
    	
    	SsoOptions or20=or1;
    	orderList.add(or20);
    	
    	SsoOptions or21=or1;
    	orderList.add(or21);
    	
    	SsoOptions or22=or1;
    	orderList.add(or22);
    	
    	SsoOptions or23=or1;
    	orderList.add(or23);
    	
    	SsoOptions or24=or1;
    	orderList.add(or24);
    	
    	SsoOptions or25=or1;
    	orderList.add(or25);
    	
    	SsoOptions or26=or1;
    	orderList.add(or26);
    	
    	SsoOptions or27=or1;
    	orderList.add(or27);
    	
    	SsoOptions or28=or1;
    	orderList.add(or28);
    	
    	SsoOptions or29=or1;
    	orderList.add(or29);
    	
    	SsoOptions or30=or1;
    	orderList.add(or30);
    	
    	SsoOptions or31=or1;
    	orderList.add(or31);
    	
    	SsoOptions or32=or1;
    	orderList.add(or32);
    	
    	SsoOptions or34=or1;
    	orderList.add(or34);
    	
    	SsoOptions or35=or1;
    	orderList.add(or35);
    	
    	SsoOptions or36=or1;
    	orderList.add(or36);
    	
    	SsoOptions or37=or1;
    	orderList.add(or37);
    	
    	SsoOptions or38=or1;
    	orderList.add(or38);
    	
    	SsoOptions or39=or1;
    	orderList.add(or39);
    	
    	SsoOptions or40=or1;
    	orderList.add(or40);
    	
    	SsoOptions or41=or1;
    	orderList.add(or41);
    	
    	SsoOptions or42=or1;
    	orderList.add(or42);
    	
    	SsoOptions or43=or1;
    	orderList.add(or43);
    	
    	SsoOptions or44=or1;
    	orderList.add(or44);
    	
    	SsoOptions or45=or1;
    	orderList.add(or45);
    	
    	SsoOptions or46=or1;
    	orderList.add(or46);
    	
    	SsoOptions or47=or1;
    	orderList.add(or47);
    	
    	SsoOptions or48=or1;
    	orderList.add(or48);
    	
    	SsoOptions or49=or1;
    	orderList.add(or49);
    	
    	SsoOptions or50=or1;
    	orderList.add(or50);
    	
    	OrderHistory oh = new OrderHistory();
    	oh.setOrder(orderList);
    	
    	return oh;
    	
    	
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("detailcom")
    public OrderDetalis getDetail(){
    	
    	//ShippingInfoSOptions so = new ShippingInfoSOptions();
    	TotalOrderOptions to = new TotalOrderOptions();
    	BillingInfoOptions bo = new BillingInfoOptions();
    	ShippingInfoTOptions so = new ShippingInfoTOptions();
    	
    	to.setOrder_id("40047001");
    	to.setItem_total("item_total");
    	to.setDiscount("4%");
    	to.setShipping_total("7.43");
    	to.setTax_total("7.09");
    	to.setGrand_total("106.93");
    	to.setOrder_status("Processing");
    	to.setOrder_date("11/23/2015");
    	to.setStore_label("Teacher Store");
    	to.setDetail_url("https://shopdev3.scholastic.net/webapp/wcs/stores/servlet/MyAcctItemHistoryView?langId=-1&amp;storeId=10751&amp;orderId=");
    	to.setPromo_code("123");
    	to.setStoreIdentifier("TSO");
    	
    	so.setName("tso a7");
    	so.setAddress1("address1");
    	so.setAddress2("address2");
    	so.setCity("city");
    	so.setState("state");
    	so.setZip("123");
    	so.setShip_type("DUMMY");
    	
    	bo.setName("Teo Test");
    	bo.setAddress1("PAGO PAGO SCHOOL");
    	bo.setAddress2("address2");
    	bo.setCity("PAGO PAGO");
    	bo.setState("AS");
    	bo.setZip("96799");
    	bo.setBill_to_phone("4323443553");
    	bo.setBill_to_email("sigqatemp1@scholastic.com");
    	bo.setCard_brand("VISA");
    	bo.setCard_number("************1111");
    	
    	SsoOrderItemOptions io = new SsoOrderItemOptions();
    	TsoOrderItemOptions tio = new TsoOrderItemOptions();
    	
    	List<ItemOptions> item = new ArrayList<ItemOptions>();
    	
    	io.setShipping_info("SCHOOL");
    	io.setOrder_item_id("1090001");
    	io.setTitle("Jennifer Lawrence");
    	io.setNickname("SCHOOL");
    	io.setShipping_amt("3.26");
    	io.setIsbn("9780531214282");
    	io.setPartNum("NTS9780531214282");
    	io.setQuantity("4");
    	io.setList_price("7.95");
    	io.setTax_dollar_amt("2.26");
    	io.setTotal_items_price("31.80");
    	io.setItem_adjust("0.00");
    	io.setItem_image("media/products/82/9780531214282_sm.jpg");
    	io.setProduct_type("Library Binding");
    	io.setTracking_href("wwww.abc.com");
    	
    	
    	tio.setShipping_info("83268518");
    	tio.setOrder_item_id("825006");
    	tio.setTitle("Number Tales: One Little Egg");
    	tio.setNickname("83268518");
    	tio.setShipping_amt("0.00");
    	tio.setIsbn("9780545412049");
    	tio.setPartNum("NTS9780545412049");
    	tio.setQuantity("1");
    	tio.setList_price("10.95");
    	tio.setTax_dollar_amt("7.26");
    	tio.setTotal_items_price("51.80");
    	tio.setItem_adjust("2.00");
    	tio.setItem_image("media/products/49/9780545412049_sm.jpg");
    	tio.setProduct_type("eBook");
    	tio.setTracking_href("wwww.abcd.com");
    	
    	
    	item.add(tio);
    	item.add(io);
    	   	
    	
    	OrderDetalis od = new OrderDetalis();
    	od.setOrder_totals(to);
    	od.setShipping_info(so);
    	od.setBilling_info(bo);
    	od.setOrder_item(item);
    	
    	return od;
    }


}
