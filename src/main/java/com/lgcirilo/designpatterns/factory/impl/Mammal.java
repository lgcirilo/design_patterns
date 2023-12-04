package com.lgcirilo.designpatterns.factory.impl;

import com.lgcirilo.designpatterns.factory.AbstractAnimal;
import com.lgcirilo.designpatterns.factory.TaxonomyClass;

public class Mammal extends AbstractAnimal {

    public Mammal() {
        this.taxonomyClass = TaxonomyClass.MAMMALIA;
    }

    @Override
    public TaxonomyClass getTaxonomhyClass() {
        return this.taxonomyClass;
    }
}
