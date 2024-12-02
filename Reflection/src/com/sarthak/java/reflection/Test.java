package com.sarthak.java.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		try {
			Class<?> myClass = Class.forName(Calculator.class.getName());// gets the name of the class that we are
																			// loading into memory
			System.out.println(myClass.getName());// com.sarthak.java.reflection.Calculator
			System.out.println();// to change lines

			Constructor<?>[] constructors = myClass.getConstructors();// gets the public constructors
			System.out.println(Arrays.toString(constructors));// since its a array object, hence we use toString()
			System.out.println();// to change lines

			System.out.println(Arrays.toString(myClass.getMethods()));// gets the methods
			// since its a array object, hence we use toString()
			System.out.println();// to change lines

			Constructor<?> constructor = myClass.getConstructor(null);// telling the reflection API that I want a
																		// constructor that takes null as a parameter
																		// that is no parameters
			System.out.println(constructor.newInstance(null));// invokes the default constructor and creates the
																// instance
																// Default Constructor
																// com.sarthak.java.reflection.Calculator@4aa8f0b4

			Constructor<?> constructor2 = myClass.getConstructor(double.class, double.class);
			// telling the reflection API that I want a constructor that takes two double
			// fields as a parameter
			// commenting the next line of code as we need the object to be formed in order
			// to do the operation now on
			// System.out.println(constructor2.newInstance(5, 10));// Parameterized
			// Constructor.....below lines are the O/P
			// com.sarthak.java.reflection.Calculator@7960847b
			// pass in the values
			Object myObj = constructor2.newInstance(5, 10);// this object will be used now on

			Method setNum1 = myClass.getMethod("setNum1", double.class);// creating object to invoke setter function
			setNum1.invoke(myObj, 6);// invoking the setter method with the returned object above with invoke()
										// method
			// multiple arguments mein , separated rahega hisab kitab

			Method setNum2 = myClass.getMethod("setNum2", double.class);// creating object to invoke setter function
			setNum2.invoke(myObj, 8);// invoking the setter method with the returned object above with invoke()
										// method
			// multiple arguments mein , separated rahega hisab kitab

			// Modifying private fields wala section hai ye
			Field num1Field = myClass.getDeclaredField("num1");// filed object created by declaring the filed we want to
																// access
			num1Field.setAccessible(true);// using the object above we set its accessibility as "true" in order to
											// access it
			num1Field.set(myObj, 80);// accessimg the field and modifying its value now

			Method method = myClass.getMethod("getNum1", null);// invoking the getter method
			System.out.println(method.invoke(myObj, null));// taking output

			Method method2 = myClass.getMethod("getNum2", null);// invoking the getter method
			System.out.println(method2.invoke(myObj, null));// taking output

			Annotation[] annotations = myClass.getAnnotations();// annotations object is here, returns array
			System.out.println(Arrays.toString(annotations));// hence the toString() is applied

			MyAnnotation annotation = (MyAnnotation) annotations[0];// annotation object for the annotations array
			// since there is only one Annotation in the class, the array will have only one
			// element type casted in order to access its values in the code below

			System.out.println(annotation.value1());// accessing fields now
			System.out.println(annotation.value2());// accessing fields now

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}

	}

}
