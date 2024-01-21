package com.lgcirilo.designpatterns.singleton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyOtherSingletonTest {
    MyOtherSingleton myOtherSingleton;
    MyOtherSingleton myOtherSingleton2;

    @BeforeEach
    void setUp() {
        myOtherSingleton  = MyOtherSingleton.getMyOtherSingleton();
        myOtherSingleton2 = MyOtherSingleton.getMyOtherSingleton();
    }

    @Test
    void getMyOtherSingleton() {
        System.out.println();
        assertEquals(myOtherSingleton, myOtherSingleton2);
    }

    @Test
    void increment() {
        myOtherSingleton.increment();
        assertEquals(1 ,myOtherSingleton2.getInternalCounter());
    }
}