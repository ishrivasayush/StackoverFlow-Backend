package com.narainox.stackoverflow.backend.exception;

import org.hibernate.tool.schema.spi.CommandAcceptanceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice //used to exception handel the exception globally.
public class GlobalExceptionHandler {
    //handle specific exceptions
    @ExceptionHandler(ResourceNotFoundException.class)     //handling the specific exception and send the custom message as response
    public ResponseEntity<?> handleResourceNotFoundException
    (ResourceNotFoundException exception, WebRequest request)
    {
        ErrorDetails errorDetails=new ErrorDetails(new Date(),exception.getMessage(),request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    //handle global exceptions
    @ExceptionHandler(Exception.class)     //handling the specific exception and send the custom message as response
    public ResponseEntity<?> handleGlobalException
    (Exception exception, WebRequest request)
    {
        ErrorDetails errorDetails=new ErrorDetails(new Date(),exception.getMessage(),request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(QuestionException.class)     //handling the specific exception and send the custom message as response
    public ResponseEntity<?> handleResourceNotFoundException
            (QuestionException exception, WebRequest request)
    {
        ErrorDetails errorDetails=new ErrorDetails(new Date(),exception.getMessage(),request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(TagException.class)     //handling the specific exception and send the custom message as response
    public ResponseEntity<?> handleResourceNotFoundException
            (TagException exception, WebRequest request)
    {
        ErrorDetails errorDetails=new ErrorDetails(new Date(),exception.getMessage(),request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

}
