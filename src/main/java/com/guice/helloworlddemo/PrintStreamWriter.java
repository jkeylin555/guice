package com.guice.helloworlddemo;

import javax.inject.Inject;
import java.io.PrintStream;

public class PrintStreamWriter implements MyDestination {
    private PrintStream printStream;
    @Inject
    public PrintStreamWriter(PrintStream printStream) {
        this.printStream = printStream;
    }
    @Override
    public void write(String s) {
        printStream.println(s);
    }
}
