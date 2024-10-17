package br.com.joao.exceptions.hendler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.joao.exceptions.ExceptonResponse;
import br.com.joao.exceptions.UnsuppotedMathOperationException;



@RestController

// Tratamento global
@ControllerAdvice   /* Sempre que a gente precesa concentrar algum tratamento que
* seria espalhado em todos os controles
*/
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptonResponse> handleAllExceptions(
			Exception ex, WebRequest request){
		ExceptonResponse exceptonResponse = new ExceptonResponse(
				new Date(), 
				ex.getMessage(), 
				request.getDescription(false));
		
			return new ResponseEntity<>(exceptonResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@ExceptionHandler(UnsuppotedMathOperationException .class)
	public final ResponseEntity<ExceptonResponse> handleBadRequestExceptions(
			Exception ex, WebRequest request){
		ExceptonResponse exceptonResponse = new ExceptonResponse(
				new Date(), 
				ex.getMessage(), 
				request.getDescription(false));
		
		return new ResponseEntity<>(exceptonResponse, HttpStatus.BAD_REQUEST);
	}
}
