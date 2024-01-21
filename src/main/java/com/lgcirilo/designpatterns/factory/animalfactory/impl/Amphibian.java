package com.lgcirilo.designpatterns.factory.animalfactory.impl;

import com.lgcirilo.designpatterns.factory.animalfactory.AbstractAnimal;
import com.lgcirilo.designpatterns.factory.animalfactory.TaxonomyClass;

public class Amphibian extends AbstractAnimal {

    public Amphibian() {
        this.taxonomyClass = TaxonomyClass.AMPHIBIA;
    }

    @Override
    public TaxonomyClass getTaxonomhyClass() {
        return this.taxonomyClass;
    }
}
