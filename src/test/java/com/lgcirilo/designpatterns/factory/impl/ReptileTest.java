package com.lgcirilo.designpatterns.factory.impl;

import com.lgcirilo.designpatterns.factory.Animal;
import com.lgcirilo.designpatterns.factory.AnimalFactory;
import com.lgcirilo.designpatterns.factory.TaxonomyClass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReptileTest {

    @Test
    @DisplayName("Mammal class has mammalia taxonomy class")
    void getTaxonomhyClass() {
        Animal animal = AnimalFactory.getAnimal("REPTILIA");
        assertEquals(TaxonomyClass.REPTILIA, animal.getTaxonomhyClass());
    }
}