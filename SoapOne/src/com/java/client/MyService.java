package com.java.client;

import java.util.List;

import com.java.src.IllegalInputException_Exception;
import com.java.src.ProdCatalogService;
import com.java.src.ProductCatalog;



public class MyService {
	
	static MyService1 obj;
	
	public static void main(String args[]) throws IllegalInputException_Exception{
		ProdCatalogService service= new 		ProdCatalogService();
		ProductCatalog port= service.getProdCatalogPort();
		String s= port.getProductName(-2);

		System.out.println(s);
		
		List<WebPages> list = obj.searchData("Payal");
	}

}

//soap://soap protocol: soap messages :tcp protocol
	//wsdl: xml : 
//restful: 4 levels of richard maturity model :0 level: stateless??
	//tools: stub/ skeleton/ wsdl: interfaces