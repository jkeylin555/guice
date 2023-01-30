package com.guice.guicedemo;
import javax.inject.Inject;

interface Car {
    void drive();
}

class BMW implements Car {
    //
    @Inject// @Inject is not required for default constructor
    public BMW() {//
    }
    @Override
    public void drive() {
        System.out.println("Driving BMW");
    }
}
public class SingletonExample {
}
