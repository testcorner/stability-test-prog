/*
 * Copyright 2011 Andres Gomez Casanova. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are
 * permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY Andres Gomez Casanova ``AS IS'' AND ANY EXPRESS
 * OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO
 * EVENT SHALL <COPYRIGHT HOLDER> OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 *  SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are
 *  those of the authors and should not be interpreted as representing official
 *  policies, either expressed or implied, of Andres Gomez Casanova.
 */
package com.android.calculator2;

import java.util.Collections;
import java.util.List;

import org.junit.runner.Runner;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;
public class RandomSuite extends Suite {

    /**
     * Please see: {@link org.junit.runners.Suite#Suite(Class, RunnerBuilder)}.
     *
     * @param klass
     *            the root class.
     * @param builder
     *            builds runners for classes in the suite
     * @throws InitializationError
     *             If any error.
     */
    public RandomSuite(Class<?> klass, RunnerBuilder builder)
            throws InitializationError {
        super(klass, builder);
    }

    /**
     * Please see: {@link org.junit.runners.Suite#Suite(RunnerBuilder, Class[])}
     * .
     *
     * @param builder
     *            builds runners for classes in the suite.
     * @param classes
     *            the classes in the suite.
     * @throws InitializationError
     *             If any error.
     */
    public RandomSuite(RunnerBuilder builder, Class<?>[] classes)
            throws InitializationError {
        super(builder, classes);
    }

    /**
     * @param klass
     * @param runners
     * @throws InitializationError
     */
    protected RandomSuite(Class<?> klass, List<Runner> runners)
            throws InitializationError {
        super(klass, runners);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.junit.runners.Suite#getChildren()
     */
    @Override
    protected List<Runner> getChildren() {
        final List<Runner> children = super.getChildren();
        Collections.shuffle(children);
        return children;
    }

}
