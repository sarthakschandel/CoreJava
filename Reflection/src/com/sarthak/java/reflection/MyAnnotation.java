package com.sarthak.java.reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

	// Accessing fileds on Annotations section
	public String value1();

	public String value2();

}
