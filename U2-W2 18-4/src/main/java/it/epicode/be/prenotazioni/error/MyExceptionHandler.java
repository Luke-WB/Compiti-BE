package it.epicode.be.prenotazioni.error;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    ResponseEntity<String> manageEntityNotFoundException(EntityNotFoundException e) {
	return new ResponseEntity<String>(e.getMessage() + " Lingua non supportata!!", HttpStatus.NOT_FOUND);
    }

}
