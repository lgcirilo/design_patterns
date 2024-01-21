package com.lgcirilo.designpatterns.factory.animalfactory.impl;

import com.lgcirilo.designpatterns.factory.animalfactory.AbstractAnimal;
import com.lgcirilo.designpatterns.factory.animalfactory.TaxonomyClass;

public class Mammal extends AbstractAnimal {

    public Mammal() {
        this.taxonomyClass = TaxonomyClass.MAMMALIA;
    }

    @Override
    public TaxonomyClass getTaxonomhyClass() {
        return this.taxonomyClass;
    }
}
