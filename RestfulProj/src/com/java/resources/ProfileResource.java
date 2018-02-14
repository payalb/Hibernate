package com.java.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.java.model.Profile;
import com.java.service.ProfileService;


@Path("/profiles")
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public class ProfileResource {

	
	private ProfileService service= new ProfileService();	
	
	
	@GET
	public List< Profile> printProfiles(){
		System.out.println("8");
		return service.getProfiles();
	}
	
	
	@POST
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED, MediaType.TEXT_PLAIN})
	public Profile getProfile(@FormParam("name") String name){
		System.out.println("id is "+ name);
		Profile message= null;
		message=service.getProfile(name);
		return message;
	}
	
	/*
	 * MessageBodyReader, MessageBodyWriter
	 
	
	@Path("/JSON")
	@GET
	public List< Profile> getMessages(){
		return service.getProfiles();
	}*/
	
	@Path("/{profileName}")
	@PUT

	public String updateProfile(@PathParam("profileName") String name, Profile m){
		System.out.println("7");
		m.setName(name);
		service.updateProfile(m);
		return m.getName();
	}
	
	/*
	 * Does not accept anything in message body
	 */
	@Path("/{profileName}")
	@DELETE
	public void deleteProfile(@PathParam("profileName") String name){
		System.out.println("6");
		service.removeProfile(name);
	}



	@Path("/{profileName}/messages")
	public MessageResource getMessage(){
		System.out.println("5");
		MessageResource rs= new MessageResource();		
		return rs;
	}
	

}
