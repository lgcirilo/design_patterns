package com.lgcirilo.designpatterns.singleton;

import com.lgcirilo.designpatterns.singleton.MySingleton;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MySingletonTest {

    @Test
    @DisplayName("Calling singleton twice return the same object")
    void callingSingletonTwiceReturnsSameObject() {
        MySingleton firstSingleton = MySingleton.getInstance();
        MySingleton secondSingleton = MySingleton.getInstance();
        assertEquals(firstSingleton, secondSingleton);
    }
}
