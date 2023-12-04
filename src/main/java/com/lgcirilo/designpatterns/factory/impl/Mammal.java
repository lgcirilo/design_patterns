package com.lgcirilo.designpatterns.factory.impl;

import com.lgcirilo.designpatterns.factory.TaxonomyClass;

public class Wolf extends AnimalImpl{

    public Wolf() {
        this.taxonomyClass = TaxonomyClass.MAMMALIA;
    }

    @Override
    public TaxonomyClass getTaxonomhyCLass() {
        return null;
    }
}
