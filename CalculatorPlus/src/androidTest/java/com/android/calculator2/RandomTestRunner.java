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

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

/**
 * This class randomize the execution of tests.
 * <p>
 * Taken from
 * http://stackoverflow.com/questions/1444314/how-can-i-make-my-junit-
 * tests-run-in-random-order
 * <p>
 * <b>Control Version</b>
 * <p>
 * <ul>
 * <li>1.0.0 Class creation.</li>
 * </ul>
 *
 * @author Michael Lloyd Lee (Mlk) - Stackoverflow
 * @version 1.0.0 2011-06-13
 */
public class RandomTestRunner extends BlockJUnit4ClassRunner {

    /**
     * Please see
     * {@link org.junit.runners.BlockJUnit4ClassRunner#BlockJUnit4ClassRunner(Class)}
     * .
     *
     * @param klass
     *            Class to execute.
     * @throws InitializationError
     *             If there is an error.
     */
    public RandomTestRunner(final Class<?> klass) throws InitializationError {
        super(klass);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.junit.runners.BlockJUnit4ClassRunner#computeTestMethods()
     */
    @Override
    protected List<FrameworkMethod> computeTestMethods() {
        final List<FrameworkMethod> methods = super.computeTestMethods();
        Collections.shuffle(methods);
        return methods;
    }

}
