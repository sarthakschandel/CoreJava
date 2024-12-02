package com.sarthak.java.reflection;

@MyAnnotation(value1 = "123", value2 = "456") // values provided for annotations
public class Calculator {

	private double num1;
	private double num2;

	public Calculator() {
		System.out.println("Default Constructor");
	}

	public Calculator(double num1, double num2) {
		System.out.println("Parameterized Constructor");// i added this line
		this.num1 = num1;
		this.num2 = num2;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double sum(int n1, int n2) {
		return n1 + n2;
	}

}
