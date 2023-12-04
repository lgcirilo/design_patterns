package com.lgcirilo.designpatterns.factory.impl;

import com.lgcirilo.designpatterns.factory.AbstractAnimal;
import com.lgcirilo.designpatterns.factory.TaxonomyClass;

public class Ave extends AbstractAnimal {
    public Ave() {
        this.taxonomyClass = TaxonomyClass.AVES;
    }

    @Override
    public TaxonomyClass getTaxonomhyClass() {
        return this.taxonomyClass;
    }
}

