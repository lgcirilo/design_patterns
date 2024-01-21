package com.lgcirilo.designpatterns.factory.animalfactory.impl;

import com.lgcirilo.designpatterns.factory.animalfactory.Animal;
import com.lgcirilo.designpatterns.factory.animalfactory.AnimalFactory;
import com.lgcirilo.designpatterns.factory.animalfactory.TaxonomyClass;
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