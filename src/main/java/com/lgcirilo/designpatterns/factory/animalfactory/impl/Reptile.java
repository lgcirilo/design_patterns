package com.lgcirilo.designpatterns.factory.animalfactory.impl;

import com.lgcirilo.designpatterns.factory.animalfactory.AbstractAnimal;
import com.lgcirilo.designpatterns.factory.animalfactory.TaxonomyClass;

public class Reptile extends AbstractAnimal {

    public Reptile() {
        this.taxonomyClass = TaxonomyClass.REPTILIA;
    }

    @Override
    public TaxonomyClass getTaxonomhyClass() {
        return this.taxonomyClass;
    }
}
