package com.java.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/comments")
public class CommentResource {
	
	//CommentDao dao= new CommentDao();
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getComments(){
		//List<Students> list= dao.getAllStudents;
		return "Comment One";
		
	}

	//dao class
	
	/*getAllComments(){
	Session session=HibernateUtil.getSession();	
	
	}
*/
}
