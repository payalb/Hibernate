package com.java.resources;

import java.net.URISyntaxException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import com.java.model.Message;
import com.java.service.MessageService;


@Path("/")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class MessageResource {
	
	private MessageService service= new MessageService();		
	
	@GET	
	public  Message printMessageBetween(@QueryParam("start") Long id, @QueryParam("size") int size
			, @QueryParam("author") String author, @PathParam("profileName") String profileName){
		System.out.println(id +"id, "+ size+" size "+ author);
		System.out.println(id +"id, "+ size+" size "+ author);
		return new Message(1,"payal","t1");
		//return message;
		
	}
	
	@GET
	public Response getResource(@Context UriInfo info) throws URISyntaxException{
		System.out.println("11");
		Message message= service.getMessage(1l);
		Response.created(info.getBaseUri()).entity(message).build();
		//List<Message> list=service.getMessages();
		
		// * Using ResponseBuilder
		 
		return Response.status(Status.OK).entity(info).build();
		
		//return Response.status(Status.ACCEPTED).entity(message).build();
/*		return Response.status(Status.CREATED).entity(message).
				header("location", "xyz").build();*/
	
		/*
		 * Response.created sets 201 status code, also adds values to
		 * location header of new resource
		 
		
		 * new UriInfo(info.getAbsolutePath().toString()+ message.getId())
		 * uri=uriInfo.getAbsolutePathBuilder().path(message.getId())*/
		 
		//return Response.created(info.getAbsolutePathBuilder().path(""+message.getId()).build()).entity(message).build();
	}
	
	
/*	@GET
	@Path("/v1/{messageId}")
	public Message getMessage(@PathParam("messageId") Long id){	
		System.out.println("id: "+id);
		Message message= null;
		message=service.getMessage(id);
		return message;
	}*/
	

	@Path("/context")
	@GET
	public String getMessages(@Context UriInfo uriInfo){
		System.out.println("2");
		
		return uriInfo.getAbsolutePath().toString();
	}
	
	
	
	@Path("/{messageId}")
	@PUT
	@Consumes({MediaType.APPLICATION_JSON})

	public Long updateMessage(@PathParam("messageId") Long id, Message m){
		System.out.println("3");
		m.setId(id);
		service.updateMessage(m);
		return m.getId();
	}
	
	/*
	 * Does not accept anything in message body
	 */
	@Path("/{id}")
	@DELETE
	public void deleteMessage(@PathParam("id") Long id){
		System.out.println("4");
		service.removeMessage(id);	
	}

}
