package com.lgcirilo.designpatterns.factory.animalfactory.impl;

import com.lgcirilo.designpatterns.factory.animalfactory.AbstractAnimal;
import com.lgcirilo.designpatterns.factory.animalfactory.TaxonomyClass;

public class Ave extends AbstractAnimal {
    public Ave() {
        this.taxonomyClass = TaxonomyClass.AVES;
    }

    @Override
    public TaxonomyClass getTaxonomhyClass() {
        return this.taxonomyClass;
    }
}

