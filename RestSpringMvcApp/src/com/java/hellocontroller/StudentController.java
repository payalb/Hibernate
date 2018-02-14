package com.java.hellocontroller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

import org.eclipse.persistence.oxm.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.java.dao.Student;
import com.java.exception.NotFoundException;
import com.java.model.StudentDao;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentDao dao;

	@RequestMapping(method = RequestMethod.GET, produces="application/xml")
	@ResponseBody
	public List<Student> getAllStudents1() {
		List<Student> list = new ArrayList<Student>();
		list.addAll(dao.getStudents());
		return list;
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Student getStudentById(@PathVariable("id") int id) {
		return dao.getStudent(id);
	}

	@RequestMapping(method = RequestMethod.GET, produces="application/html")
	@ResponseBody
	public Student get(@RequestParam("name") String name) {
		Student obj = dao.getStudentByName(name);
		return obj;
	}

	@RequestMapping(method = RequestMethod.POST)
	// @ResponseStatus(HttpStatus.MOVED_PERMANENTLY)
	// void post(@RequestBody Student obj, WebRequest req, HttpServletResponse
	// resp){
	public Response post(@RequestBody Student obj) {
		int i = dao.insertStudent(obj);
		if (i == 1) {
			return Response.status(404).entity("Inserted succesfully").build();
		}
		return Response.status(500).entity("Failed to insert record for " + obj.getName()).build();
		// resp.addHeader("Location", req.getContextPath());

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public Response delete(@PathVariable("id") int id) {
		if (dao.deleteStudent(id)) {
			return Response.status(404).entity("Deleted succesfully").build();
		}
		return Response.status(500).entity("Deletion failed").build();
	}

	/*
	 * Handle NotFoundException exceptions for this controller
	 */
	@ExceptionHandler(RuntimeException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Thrown runtime exception")
	public void handleNotFound(NotFoundException ex) {

	}

}