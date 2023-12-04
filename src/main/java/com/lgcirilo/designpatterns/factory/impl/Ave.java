package com.lgcirilo.designpatterns.factory.impl;

import com.lgcirilo.designpatterns.factory.TaxonomyClass;

public class Bird extends AnimalImpl{
    public Bird() {
        this.taxonomyClass = TaxonomyClass.AVES;
    }

    @Override
    public TaxonomyClass getTaxonomhyCLass() {
        return this.taxonomyClass;
    }
}

