package com.guice;

import com.google.inject.AbstractModule;
import com.guice.helloworlddemo.HelloWorldModule;

public class MainModule extends AbstractModule {
    @Override
    protected void configure() {
        install(new HelloWorldModule());
    }
}
