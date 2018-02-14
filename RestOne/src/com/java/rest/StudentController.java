/*package com.java.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import com.java.model.Address;
import com.java.model.Student;
import com.java.model.StudentDao;
import com.java.model.StudentDaoImpl;



@Path("/student/")
public class StudentController {
	
	StudentDao dao= new StudentDaoImpl();
	
	public StudentStatus() {
		System.out.println("Instantiated StudentStatus class");
	}
	
	@POST
	@Produces(MediaType.TEXT_HTML )
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED, MediaType.TEXT_PLAIN})
	public String getStudent(@FormParam("id") String id,@FormParam("name") String name,@FormParam("location") String location,
			@FormParam("address.city") String city,@FormParam("address.pincode") String pin,@FormParam("address.street") String street){
		
		System.out.println("Entered in getStudent method");
		try{
			Address address= new Address(street, city, pin);
			Student student = new Student(id, name,location, address);
			int saved = dao.save(student);
			System.out.println("Return 1 if saved, else return -1. Is it saved? Answer= "+saved);
			return "Student Saved";
		}catch(Throwable e){
			e.printStackTrace();
			return "Student not created";
		}	
		
	}

	@Path("/{ID}")
	@DELETE
	@Produces(MediaType.TEXT_HTML)
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED,MediaType.TEXT_PLAIN})
	public String deleteThis(@PathParam("ID") String id){
		System.out.println("Entered in deleteThis method");
		boolean deleted = false;
		try{
			deleted = dao.delete(id);
			System.out.println("Is Deleted?:"+deleted);
			return ("Is Deleted?:"+deleted);
		}catch(Throwable e){
			e.printStackTrace();
			return "Is Deleted?: FALSE";
		}
		
	}
	
	@Path("/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,
		MediaType.TEXT_HTML})
	public Response getResponse1(@PathParam("id") String id){
		Student student= dao.findByID(id);
		return Response.status(Status.OK).entity(student).build();
		//return Response.status(Status.ACCEPTED).entity(message).build();
		//return Response.status(Status.CREATED).entity(message).header("location","xyz").build();
		
	}
	
	@Path("/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,
		MediaType.TEXT_HTML})
	public Response getResponse2(@PathParam("id") String id){
		Student student= dao.findByID(id);
		return Response.status(Status.OK).entity(student).build();
		//return Response.status(Status.ACCEPTED).entity(message).build();
		//return Response.status(Status.CREATED).entity(message).header("location","xyz").build();
		
	}
	
}

*/