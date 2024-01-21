package com.lgcirilo.designpatterns.factory.animalfactory.impl;

import com.lgcirilo.designpatterns.factory.animalfactory.Animal;
import com.lgcirilo.designpatterns.factory.animalfactory.AnimalFactory;
import com.lgcirilo.designpatterns.factory.animalfactory.TaxonomyClass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AmphibianTest {

    @Test
    @DisplayName("Amphibian class has amphibian taxonomy class")
    void getTaxonomhyClass() {
        Animal animal = AnimalFactory.getAnimal("AMPHIBIAN");
        assertEquals(TaxonomyClass.AMPHIBIA, animal.getTaxonomhyClass());
    }
}