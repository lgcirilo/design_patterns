package com.lgcirilo.designpatterns.factory.impl;

import com.lgcirilo.designpatterns.factory.TaxonomyClass;

public class Frog extends AnimalImpl{

    public Frog() {
        this.taxonomyClass = TaxonomyClass.AMPHIBIA;
    }

    @Override
    public TaxonomyClass getTaxonomhyCLass() {
        return this.taxonomyClass;
    }
}
