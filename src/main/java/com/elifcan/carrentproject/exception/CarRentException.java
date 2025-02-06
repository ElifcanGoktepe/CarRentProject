package com.elifcan.carrentproject.exception;

import lombok.Getter;

@Getter
public class CarRentException extends RuntimeException { // because error only occurs when the application run

    private ErrorType errorType;
    public CarRentException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }

}
