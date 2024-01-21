package com.lgcirilo.designpatterns.singleton;

public class MyOtherSingleton {

    private Integer internalCounter = 0;

    private static MyOtherSingleton myOtherSingleton;

    private MyOtherSingleton() {
    }

    public static MyOtherSingleton getMyOtherSingleton() {
        if (null == myOtherSingleton) {
            myOtherSingleton = new MyOtherSingleton();
        }

        return myOtherSingleton;
    }

    public Integer increment() {
        return ++internalCounter;
    }

    public Integer getInternalCounter() {
        return this.internalCounter;
    }
}

class Main {
    public static void main(String[] args) {
        MyOtherSingleton ms1 = MyOtherSingleton.getMyOtherSingleton();
        MyOtherSingleton ms2 = MyOtherSingleton.getMyOtherSingleton();
        for (int i = 0; i < 3; i++) {
            ms1.increment();
        }

        System.out.println(ms2.getInternalCounter());
        System.out.println(ms1==ms2);
    }
}
