package org.koushik.javabrains.messenger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.koushik.javabrains.messenger.model.ErrorMessage;
@Provider
public class DataNotFountExceptionMapper implements ExceptionMapper<DataNotFountException>{
	@Override
	public Response toResponse(DataNotFountException ex){
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), 404, "http://javabrains.koushik.org");
		return Response.status(Status.NOT_FOUND).entity(errorMessage).build();
	}
}
