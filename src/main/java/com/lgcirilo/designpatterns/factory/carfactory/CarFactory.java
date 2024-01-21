package com.lgcirilo.designpatterns.factory.carfactory;

import com.lgcirilo.designpatterns.factory.carfactory.impl.HatchBack;
import com.lgcirilo.designpatterns.factory.carfactory.impl.Sedan;
import com.lgcirilo.designpatterns.factory.carfactory.impl.Suv;

public class CarFactory {

    public static Car getCar(String type) throws CarDoesNotExistException {
        if (type.toLowerCase().equals("sedan")) {
            return new Sedan();
        }

        if (type.toLowerCase().equals("hatchback")) {
            return new HatchBack();
        }

        if (type.toLowerCase().equals("suv")) {
            return new Suv();
        }

        throw new CarDoesNotExistException("Selected car type does not exist");
    }


}
