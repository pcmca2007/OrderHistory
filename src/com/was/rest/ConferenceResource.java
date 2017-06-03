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
    
    	
    	or.setStore_id("SSO");
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
    	
    	or1.setStore_id("TSO");
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
    	
    /*	Order or2= or;
    	orderList.add(or2);
    	
    	Order or3=or2;
    	orderList.add(or3);
    	
    	Order or4=or1;
    	orderList.add(or4);
    	
    	Order or5=or2;
    	orderList.add(or5);
    	
    	Order or6=or1;
    	orderList.add(or6);
    	
    	Order or7=or1;
    	orderList.add(or7);
    	
    	Order or8=or1;
    	orderList.add(or8);
    	
    	Order or9=or1;
    	orderList.add(or9);
    	
    	Order or10=or1;
    	orderList.add(or10);
    	
    	Order or11=or1;
    	orderList.add(or11);
    	
    	Order or12=or1;
    	orderList.add(or12);
    	
    	Order or13=or1;
    	orderList.add(or13);
    	
    	Order or14=or1;
    	orderList.add(or14);
    	
    	Order or15=or1;
    	orderList.add(or15);
    	
    	Order or16=or1;
    	orderList.add(or16);
    	
    	Order or17=or1;
    	orderList.add(or17);
    	
    	Order or18=or1;
    	orderList.add(or18);
    	
    	Order or19=or1;
    	orderList.add(or19);
    	
    	Order or20=or1;
    	orderList.add(or20);
    	
    	Order or21=or1;
    	orderList.add(or21);
    	
    	Order or22=or1;
    	orderList.add(or22);
    	
    	Order or23=or1;
    	orderList.add(or23);
    	
    	Order or24=or1;
    	orderList.add(or24);
    	
    	Order or25=or1;
    	orderList.add(or25);
    	
    	Order or26=or1;
    	orderList.add(or26);
    	
    	Order or27=or1;
    	orderList.add(or27);
    	
    	Order or28=or1;
    	orderList.add(or28);
    	
    	Order or29=or1;
    	orderList.add(or29);
    	
    	Order or30=or1;
    	orderList.add(or30);
    	
    	Order or31=or1;
    	orderList.add(or31);
    	
    	Order or32=or1;
    	orderList.add(or32);
    	
    	Order or34=or1;
    	orderList.add(or34);
    	
    	Order or35=or1;
    	orderList.add(or35);
    	
    	Order or36=or1;
    	orderList.add(or36);
    	
    	Order or37=or1;
    	orderList.add(or37);
    	
    	Order or38=or1;
    	orderList.add(or38);
    	
    	Order or39=or1;
    	orderList.add(or39);
    	
    	Order or40=or1;
    	orderList.add(or40);
    	
    	Order or41=or1;
    	orderList.add(or41);
    	
    	Order or42=or1;
    	orderList.add(or42);
    	
    	Order or43=or1;
    	orderList.add(or43);
    	
    	Order or44=or1;
    	orderList.add(or44);
    	
    	Order or45=or1;
    	orderList.add(or45);
    	
    	Order or46=or1;
    	orderList.add(or46);
    	
    	Order or47=or1;
    	orderList.add(or47);
    	
    	Order or48=or1;
    	orderList.add(or48);
    	
    	Order or49=or1;
    	orderList.add(or49);
    	
    	Order or50=or1;
    	orderList.add(or50);*/
    	
    	OrderHistory oh = new OrderHistory();
    	oh.setOrder(orderList);
    	
    	return oh;
    	
    	
    }



}
