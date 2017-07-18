package com.android.calculator2;

/**
 * Created by EdenLai on 2017/7/11.
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention( RetentionPolicy.RUNTIME )
@Target( {
        java.lang.annotation.ElementType.METHOD
} )
public @interface Repeat {
    public abstract int times();
}