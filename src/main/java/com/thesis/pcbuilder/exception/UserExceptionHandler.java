package com.thesis.pcbuilder.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class UserExceptionHandler {

    @ExceptionHandler(UserAlreadyExistsException.class)
    @ResponseStatus(code = HttpStatus.CONFLICT)
    public ErrorResponse handlerUserAlreadyExits(UserAlreadyExistsException userAlreadyExistsException){
        String errorMessage = userAlreadyExistsException.getMessage();
        log.error(errorMessage);
        return ErrorResponse.builder()
                .message(errorMessage)
                .build();
    }
}
