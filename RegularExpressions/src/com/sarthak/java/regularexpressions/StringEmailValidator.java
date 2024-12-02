package com.sarthak.java.regularexpressions;

public class StringEmailValidator {

	public static void main(String[] args) {
		String email = "sarthak.s.chandel@gmail.com";
		if (email.matches("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+$")) {
			System.out.println("valid email id");
		} else {
			System.out.println("invalid email");
		}

	}

}
