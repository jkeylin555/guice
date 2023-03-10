package com.guice.helloworlddemo;

import javax.inject.Inject;
import com.google.inject.Provider;

public class StringWritingApplet implements MyApplet {
    private MyDestination destination;
    private Provider<String> stringProvider;
    @Inject
    public StringWritingApplet(MyDestination destination, @Output Provider<String> stringProvider) {
        this.destination = destination;
        this.stringProvider = stringProvider;
    }
    private void writeString() {
        destination.write(stringProvider.get());
    }
//    @Override
    public void run() {
        writeString();
    }
}
