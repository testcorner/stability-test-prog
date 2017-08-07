package com.android.calculator2;

/**
 * Created by EdenLai on 2017/7/25.
 */

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Target({METHOD, TYPE})
@Retention(RUNTIME)
public @interface Duration {
    int s() default 100;
}

