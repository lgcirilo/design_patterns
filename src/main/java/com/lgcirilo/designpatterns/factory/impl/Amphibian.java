package com.lgcirilo.designpatterns.factory.impl;

import com.lgcirilo.designpatterns.factory.AbstractAnimal;
import com.lgcirilo.designpatterns.factory.TaxonomyClass;

public class Amphibian extends AbstractAnimal {

    public Amphibian() {
        this.taxonomyClass = TaxonomyClass.AMPHIBIA;
    }

    @Override
    public TaxonomyClass getTaxonomhyClass() {
        return this.taxonomyClass;
    }
}
