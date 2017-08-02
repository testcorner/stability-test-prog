package com.android.calculator2;

/**
 * Created by EdenLai on 2017/7/25.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Target({METHOD, TYPE})
@Retention(RUNTIME)
@Inherited
public @interface SuiteTest {
    /**
     * @return the classes to be run
     */
    public Class<?>[] value();
}

