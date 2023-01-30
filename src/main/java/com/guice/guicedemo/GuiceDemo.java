package com.guice.guicedemo;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import java.lang.annotation.Retention;
import javax.inject.Inject;
import javax.inject.Qualifier;

public class GuiceDemo {
    @Qualifier
    @Retention(RUNTIME)
    @interface Message {}

    @Qualifier
    @Retention(RUNTIME)
    @interface Count {}

    static class DemoModule extends AbstractModule {

        @Override
        protected void configure() {
             bind(String.class).annotatedWith(Message.class).toInstance("hello world");
             bind(int.class).annotatedWith(Count.class).toInstance(3);
        }
    }

    static class Greeter {
        private final String message;
        private final int count;

        @Inject
        Greeter(@Message String message, @Count int count) {
            this.message = message;
            this.count = count;
        }

        void sayHello() {
            for (int i=0; i < count; i++) {
                System.out.println(message);
            }
        }
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new DemoModule());
        Greeter greeter = injector.getInstance(Greeter.class);
        greeter.sayHello();
    }
}