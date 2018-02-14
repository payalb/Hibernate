package com.src.publisher;

import javax.xml.ws.Endpoint;

import src.com.ProdCatalog;

public class ProductCatalogPublisher {
	
	public static void main(String args[]){
		/*
		 * Any port not currently in use
		 */
		Endpoint.publish("http://localhost:1245/ProductCatalog", new ProdCatalog());
	}

}
