package com.mateus.pokedex.project.exception;

import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/*
 * Classe de sobreescrita de Exceptions. Quando for utilizada a chamada desses metódos, deverá ser utilizado 
 * a chamada da Excpetion dentro do @ExceptionHandler()
*/

@RestControllerAdvice
public class GlobalExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    //retorna mensagem passada pela classe que chamou
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleBusinessException(IllegalArgumentException businessException) {
        return new ResponseEntity<>(businessException.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
    }

    //Dispara excessão para pokémon não encontrado
    //@ExceptionHandler(NoSuchElementException.class)
    //public ResponseEntity<String> ResourceNotFoundException(NoSuchElementException notFoundException) {
    //    return new ResponseEntity<>("Pokémon não encontrado: ", HttpStatus.NOT_FOUND);
    //}

    //Dispara excessão para pokémon não encontrado
    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> ResourceNotFoundByIdException(NoSuchElementException notFoundByIdException) {
        return new ResponseEntity<>(notFoundByIdException.getMessage(), HttpStatus.NOT_FOUND);
    }
}
