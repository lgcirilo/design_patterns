package com.lgcirilo.designpatterns.factory;

import com.lgcirilo.designpatterns.factory.Animal;
import com.lgcirilo.designpatterns.factory.impl.Amphibian;
import com.lgcirilo.designpatterns.factory.impl.Ave;
import com.lgcirilo.designpatterns.factory.impl.Mammal;
import com.lgcirilo.designpatterns.factory.impl.Reptile;

public class AnimalFactory {

    public static Animal getAnimal(String taxonomyClass) {
        if (taxonomyClass.equals("AVES")) {
            return new Ave();
        }

        if (taxonomyClass.equals("AMPHIBIAN")) {
            return new Amphibian();
        }

        if (taxonomyClass.equals("REPTILIA")) {
            return new Reptile();
        }

        if (taxonomyClass.equals("MAMMALIA")) {
            return new Mammal();
        }
        return null;
    }
}
