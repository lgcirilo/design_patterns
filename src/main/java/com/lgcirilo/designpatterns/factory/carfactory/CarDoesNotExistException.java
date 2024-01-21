package com.lgcirilo.designpatterns.factory.carfactory;

public class CarDoesNotExistException extends Exception{
    public CarDoesNotExistException(String s)
    {
        super(s);
    }
}
