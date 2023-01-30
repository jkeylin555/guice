package com.guice;

import com.google.inject.Guice;
import com.guice.helloworlddemo.HelloWorldModule;
import com.guice.helloworlddemo.MyApplet;

public class Main {
    /**
     * bootstrap method:
     * parse command line arguments
     * set up environment
     * kick off main logic
     * @param args
     */
    public static void main(String[] args) {
//        MyApplet mainApplet = Guice.createInjector(new HelloWorldModule()).getInstance(MyApplet.class);
//        mainApplet.run();
        Long a = 0L;
        System.out.println(a);

    }

}