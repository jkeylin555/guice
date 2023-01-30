package com.guice.helloworlddemo;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
@BindingAnnotation
@Retention(RUNTIME)
public @interface Output {
}
