package com.lgcirilo.designpatterns.factory.impl;

import com.lgcirilo.designpatterns.factory.AbstractAnimal;
import com.lgcirilo.designpatterns.factory.TaxonomyClass;

public class Reptile extends AbstractAnimal {

    public Reptile() {
        this.taxonomyClass = TaxonomyClass.REPTILIA;
    }

    @Override
    public TaxonomyClass getTaxonomhyClass() {
        return this.taxonomyClass;
    }
}
