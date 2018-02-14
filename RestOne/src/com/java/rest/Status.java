package com.java.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/v1/status/")
public class Status {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getTitle(){
		return "JAXRS";
	}
	
	@Path("/release")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getRelease(){
		return "1.1";
	}
	
	
}
