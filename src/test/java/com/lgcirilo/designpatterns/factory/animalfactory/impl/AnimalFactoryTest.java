package com.lgcirilo.designpatterns.factory.animalfactory.impl;

import com.lgcirilo.designpatterns.factory.animalfactory.Animal;
import com.lgcirilo.designpatterns.factory.animalfactory.AnimalFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalFactoryTest {
    @Test
    @DisplayName("Invalid animal class returns null")
    void whenAnimalClassIsInvalidReturnNullAnimalObject() {
        Animal animal = AnimalFactory.getAnimal("INSECT");
        assertNull(animal);
    }

    @Test
    @DisplayName("Factory yields mammal")
    void whenAnimalClassIsInMammalThenReturnMammalObject() {
        Animal animal = AnimalFactory.getAnimal("MAMMALIA");
        assertInstanceOf(Mammal.class, animal);
    }

    @Test
    @DisplayName("Factory yields ave")
    void whenAnimalClassIsInAveThenReturnMammalObject() {
        Animal animal = AnimalFactory.getAnimal("AVES");
        assertInstanceOf(Ave.class, animal);
    }

    @Test
    @DisplayName("Factory yields reptile")
    void whenAnimalClassIsInReptileThenReturnMammalObject() {
        Animal animal = AnimalFactory.getAnimal("REPTILIA");
        assertInstanceOf(Reptile.class, animal);
    }

    @Test
    @DisplayName("Factory yields amphibian")
    void whenAnimalClassIsInAmphibianThenReturnAmphibianObject() {
        Animal animal = AnimalFactory.getAnimal("AMPHIBIAN");
        assertInstanceOf(Amphibian.class, animal);
    }
}
