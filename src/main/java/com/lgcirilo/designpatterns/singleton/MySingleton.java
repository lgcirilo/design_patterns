package com.lgcirilo.designpatterns.singleton;

public class MySingleton {

    private static MySingleton mySingleton;

    private MySingleton() {
    }

    public MySingleton getMySingleton() {
        return this.mySingleton;
    }

    public static MySingleton getInstance() {
        if (mySingleton == null) {
            mySingleton = new MySingleton();
        }
        return mySingleton;
    }
}
