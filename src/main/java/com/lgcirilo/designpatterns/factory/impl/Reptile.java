package com.lgcirilo.designpatterns.factory.impl;

import com.lgcirilo.designpatterns.factory.TaxonomyClass;

public class Turtle extends AnimalImpl {

    public Turtle() {
        this.taxonomyClass = TaxonomyClass.REPTILIA;
    }

    @Override
    public TaxonomyClass getTaxonomhyCLass() {
        return null;
    }
}
