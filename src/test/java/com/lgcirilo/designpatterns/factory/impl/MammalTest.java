package com.lgcirilo.designpatterns.factory.impl;

import com.lgcirilo.designpatterns.factory.Animal;
import com.lgcirilo.designpatterns.factory.AnimalFactory;
import com.lgcirilo.designpatterns.factory.TaxonomyClass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {

    @Test
    @DisplayName("Mammal class has mammalia taxonomy class")
    void getTaxonomhyClass() {
        Animal animal = AnimalFactory.getAnimal("MAMMALIA");
        assertEquals(TaxonomyClass.MAMMALIA, animal.getTaxonomhyClass());
    }
}