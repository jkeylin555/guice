package com.guice.guicedemo;

import javax.inject.Inject;
import javax.inject.Qualifier;

import com.google.inject.*;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

public class GreeterDemo1 {
    @Qualifier
    @Retention(RUNTIME)
    @interface Message {}

    @Qualifier
    @Retention(RUNTIME)
    @interface Count {}

    static class DemoModule extends AbstractModule {

        @Override
        protected void configure() {
            bind(String.class).annotatedWith(Message.class).toInstance("Hello World!");
            bind(int.class).annotatedWith(Count.class).toInstance(5);
        }
    }
    public static class Greeter {
        private final String message;
//        private final int count;
        @Inject
        Greeter(@Message String message) {
            this.message = message;
//            this.count = count;
        }

        void sayHello() {
            for (int i = 0; i < 3; i++) {
                System.out.println(message);
            }
        }
    }



    public static void main(String[] args) {
        Key<String> databaseKey = Key.get(String.class);
        Injector injector = Guice.createInjector(new DemoModule());
        Greeter greeter = injector.getInstance(Greeter.class);
        greeter.sayHello();
    }
}



