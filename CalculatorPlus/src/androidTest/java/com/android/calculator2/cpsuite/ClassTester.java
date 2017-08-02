/*
 * @author Johannes Link (business@johanneslink.net)
 * 
 * Published under Apache License, Version 2.0 (http://apache.org/licenses/LICENSE-2.0)
 */
package com.android.calculator2.cpsuite;

public interface ClassTester {
	boolean acceptClass(Class<?> clazz);

	boolean acceptClassName(String className);

	boolean acceptInnerClass();

	boolean searchInJars();
}