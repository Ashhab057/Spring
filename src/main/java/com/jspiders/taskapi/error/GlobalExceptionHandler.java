package com.jspiders.taskapi.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<String> arithmeticExceptionHandler(ArithmeticException ex){
        System.out.println("Handling ArithmeticException");
        ex.printStackTrace();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Something went wrong");
    }



    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> nullPointerExceptionHandler(NullPointerException ex){
        System.out.println("Handling NullPointerException");
        ex.printStackTrace();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Something went wrong");
    }

    @ExceptionHandler(InvalidNameException.class)
    public ResponseEntity<String> invalidNameExceptionHandler(InvalidNameException ex)
    {
        System.out.println("Handling invalidNameException");
        ex.printStackTrace();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

    @ExceptionHandler(InvalidEmailException.class)
    public ResponseEntity<String> invalidEmailExceptionHandler(InvalidEmailException ex)
    {
        System.out.println("Handling invalidNameException");
        ex.printStackTrace();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

    @ExceptionHandler(InvalidMobileException.class)
    public ResponseEntity<String> invalidMobileExceptionHandler(InvalidMobileException ex)
    {
        System.out.println("Handling invalidMobileException");
        ex.printStackTrace();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

    @ExceptionHandler(InvalidPasswordException.class)
    public ResponseEntity<String> invalidPasswordExceptionHandler(InvalidPasswordException ex)
    {
        System.out.println("Handling invalidPasswordException");
        ex.printStackTrace();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,String>> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException ex)
    {



        
        Map<String,String> errorMap = new HashMap<>();

        List<FieldError> fieldErrors = ex.getFieldErrors();

        for(FieldError fieldError : fieldErrors){
            String field = fieldError.getField();
            String errorMessage = fieldError.getDefaultMessage();

            errorMap.put(field,errorMessage);
        }

//        FieldError fielderror = ex.getFieldError();
//
//        String field        = fielderror.getField();
//        String errorMessage = fielderror.getDefaultMessage();
//
//
//        Map<String,String> errorMap  = new HashMap<>();
//        errorMap.put(field,errorMessage);

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMap);
    }





}
