package com.java.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.java.model.ErrorMessage;

/*
 * Registers it in jaxrs and maps exception.
 * Declare this class in jersey framework
 * Restart server needed
 * Map exception to response
 */
@Provider
public class InvalidResponseExceptionMapper implements ExceptionMapper<InvalidResponseException>{

	@Override
	public Response toResponse(InvalidResponseException exception) {
		ErrorMessage msg= new ErrorMessage(404, exception.getMessage());
		return Response.status(Status.NOT_FOUND).entity(msg).build();
	}

}
