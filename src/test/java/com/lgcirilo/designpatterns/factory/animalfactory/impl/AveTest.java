package com.lgcirilo.designpatterns.factory.animalfactory.impl;

import com.lgcirilo.designpatterns.factory.animalfactory.Animal;
import com.lgcirilo.designpatterns.factory.animalfactory.AnimalFactory;
import com.lgcirilo.designpatterns.factory.animalfactory.TaxonomyClass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AveTest {

    @Test
    @DisplayName("Ave class has aves taxonomy class")
    void getTaxonomhyClass() {
        Animal animal = AnimalFactory.getAnimal("AVES");
        assertEquals(TaxonomyClass.AVES, animal.getTaxonomhyClass());
    }
}