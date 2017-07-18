package com.android.calculator2;

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

/**
 * Created by EdenLai on 2017/7/17.
 */

public class NameAwareRunner extends BlockJUnit4ClassRunner {

    public NameAwareRunner(Class<?> aClass) throws InitializationError {
        super(aClass);
    }

    @Override

    protected Statement methodBlock(FrameworkMethod frameworkMethod) {
        System.out.println(frameworkMethod.getName());
        return super.methodBlock(frameworkMethod);
    }
}
