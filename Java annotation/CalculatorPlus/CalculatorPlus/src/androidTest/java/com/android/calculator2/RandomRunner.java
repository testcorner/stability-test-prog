package com.android.calculator2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

public class RandomRunner extends BlockJUnit4ClassRunner {

    public RandomRunner(Class<?> clazz) throws InitializationError {
        super(clazz);
    }

    @Override
    protected List<FrameworkMethod> computeTestMethods() {
        List<FrameworkMethod> methods = super.computeTestMethods();
        List<FrameworkMethod> newMethods = new ArrayList<>(methods);
        Collections.shuffle(newMethods);
        return newMethods;
    }
}
