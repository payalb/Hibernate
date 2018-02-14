package com.java.hellocontroller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.dao.HelloDao;
import com.java.dao.MyObject;
import com.java.model.MyList;


@Component
 @Path("/hello")
 @Produces(MediaType.TEXT_PLAIN)
public class HelloControllerOne {
 
	 @Autowired
	 HelloDao dao;
	 
	@GET
	
	public String get(){
		 MyList<MyObject> list= new MyList<MyObject>();
		 list.addAll(dao.getList());
		 return list.toString();		 
	 }
	 
	@Path("/{word}")
	@GET
	public MyObject get(@PathParam("word") String word){
		 MyObject obj= dao.getObject(word);
		 return obj;		 
	 }
	 
/*@POST
	@ResponseStatus(HttpStatus.MOVED_PERMANENTLY)
	 
	  * Default status: ok
	  * Request body mapped to MyObject
	  
	 void post(@RequestBody MyObject obj, WebRequest req, HttpServletResponse resp){
		 dao.addObject(obj);
		 resp.addHeader("Location", req.getContextPath());
		 
	 }*/
	 
	 
@Path("/{word}")
@POST
public	 MyObject get1(@PathParam("word") String word){
		 MyObject obj= dao.getObject(word);		
		 return obj;
	 }
	 
	 /*
	  * Handle NotFoundException exceptions for this controller
	  */
	/* @ExceptionHandler(NotFoundException.class)
	 @ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Object not found")
	 void handleNotFound(NotFoundException ex){
		 
	 }
	 */
	 
	 
	 
}