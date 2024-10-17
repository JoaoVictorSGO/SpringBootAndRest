package br.com.joao.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)//Vai retonar um código de erro e qual codigo de erro
public class UnsuppotedMathOperationException extends RuntimeException{
	public UnsuppotedMathOperationException(String ex) {
		super(ex);
	}

	private static final long serialVersionUID = 1L;
	}
