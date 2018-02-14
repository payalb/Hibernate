package com.java.rest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class RestClient {

	public static void main(String[] args) {
		Client client = Client.create();
		WebResource resource = client
				.resource("http://localhost:8080/RestSpringMvcApp/hello/payal");
		ClientResponse response = resource.accept("application/xml").get(
				ClientResponse.class);
		if (response.getStatus() == 200) {
			String output = response.getEntity(String.class);
			System.out.println(output);
		} else {
			System.out.println("Error");
		}

		/*
		 * ClientConfig config = new ClientConfig  n();
		 * 
		 * Client client = ClientBuilder.newClient(config);
		 * 
		 * WebTarget target = client.target(getBaseURI());
		 * 
		 * String response = target.path("v1"). path("status"). request().
		 * get(Response.class) .toString(); System.out.println(response);
		 * 
		 * } private static URI getBaseURI() { return
		 * UriBuilder.fromUri("http://localhost:8080/RestOne/api/").build(); }
		 */

	}
}
