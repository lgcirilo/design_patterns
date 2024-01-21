package com.lgcirilo.designpatterns.factory.carfactory;

import com.lgcirilo.designpatterns.factory.carfactory.impl.HatchBack;
import com.lgcirilo.designpatterns.factory.carfactory.impl.Sedan;
import com.lgcirilo.designpatterns.factory.carfactory.impl.Suv;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTest {

    @ParameterizedTest
    @MethodSource("getSedans")
    void whenTypeIsSedanObjectCreatedIsOfClassSedan(Car car) throws CarDoesNotExistException {
        Assertions.assertInstanceOf(Sedan.class, car);
    }

    @ParameterizedTest
    @MethodSource("getHatchBacks")
    void whenTypeIsHatchBackObjectCreatedIsOfClassHatchBack(Car car) throws CarDoesNotExistException {
        Assertions.assertInstanceOf(HatchBack.class, car);
    }

    @ParameterizedTest
    @MethodSource("getSuvs")
    void whenTypeIsSuvObjectCreatedIsOfClassSuv(Car car) throws CarDoesNotExistException {
        Assertions.assertInstanceOf(Suv.class, car);
    }

    @Test
    void whenTypeIsNotSpecifiedExceptionIsThrow() throws CarDoesNotExistException {
        Assertions.assertThrows(CarDoesNotExistException.class, () -> CarFactory.getCar("truck"));
    }

    private static Stream<Arguments> getSedans() throws CarDoesNotExistException {
        return Stream.of(
                Arguments.of(CarFactory.getCar("sedan")),
                Arguments.of(CarFactory.getCar("SEDAN")),
                Arguments.of(CarFactory.getCar("Sedan")),
                Arguments.of(CarFactory.getCar("sedaN"))
        );
    }

    private static Stream<Arguments> getHatchBacks() throws CarDoesNotExistException {
        return Stream.of(
                Arguments.of(CarFactory.getCar("HatchBack")),
                Arguments.of(CarFactory.getCar("hatchback")),
                Arguments.of(CarFactory.getCar("HATCHBACK")),
                Arguments.of(CarFactory.getCar("hatchbacK"))
        );
    }

    private static Stream<Arguments> getSuvs() throws CarDoesNotExistException {
        return Stream.of(
                Arguments.of(CarFactory.getCar("suv")),
                Arguments.of(CarFactory.getCar("SUV")),
                Arguments.of(CarFactory.getCar("Suv")),
                Arguments.of(CarFactory.getCar("suV"))
        );
    }
}