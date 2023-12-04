package com.lgcirilo.designpatterns.factory.impl;

import com.lgcirilo.designpatterns.factory.Animal;

public class AnimalFactory {

    public static Animal getAnimal(String taxonomyClass) {
        if (taxonomyClass.equals("AVE")) {
            return new Ave();
        }

        if (taxonomyClass.equals("AMPHIBIAN")) {
            return new Amphibian();
        }

        if (taxonomyClass.equals("REPTILE")) {
            return new Reptile();
        }

        if (taxonomyClass.equals("MAMMAL")) {
            return new Mammal();
        }
        return null;
    }
}
