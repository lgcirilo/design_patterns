package com.lgcirilo.designpatterns.factory.animalfactory.impl;

import com.lgcirilo.designpatterns.factory.animalfactory.Animal;
import com.lgcirilo.designpatterns.factory.animalfactory.AnimalFactory;
import com.lgcirilo.designpatterns.factory.animalfactory.TaxonomyClass;
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