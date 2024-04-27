package br.com.hexagonal.adapters.inPut.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import br.com.hexagonal.application.core.exceptions.DomainException;
import br.com.hexagonal.application.core.exceptions.RestErrorMessage;


@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
	
	 @ExceptionHandler(DomainException.NotFoundException.class)
    private ResponseEntity<RestErrorMessage> contatoNotFoundException(DomainException.NotFoundException e){
        RestErrorMessage errorMessage = new RestErrorMessage(HttpStatus.NOT_FOUND, e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
    }

    @ExceptionHandler(DomainException.ExistingException.class)
    private ResponseEntity<RestErrorMessage> contatoExistingException(DomainException.ExistingException e){
        RestErrorMessage errorMessage = new RestErrorMessage(HttpStatus.CONFLICT, e.getMessage());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(errorMessage);
    }

}
