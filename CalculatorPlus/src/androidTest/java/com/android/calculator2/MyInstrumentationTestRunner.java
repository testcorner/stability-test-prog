package com.android.calculator2;

import android.os.Bundle;
import android.test.InstrumentationTestRunner;

/**
 * Created by EdenLai on 2017/7/18.
 */

public class MyInstrumentationTestRunner extends InstrumentationTestRunner {
    @Override
    public void onCreate(Bundle instrumentationArguments) {
        instrumentationArguments.putString("size", "medium"); // Run medium tests
        // Add more ...
        super.onCreate(instrumentationArguments);
    }
}
