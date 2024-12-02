package com.sarthak.java.regularexpressions;

import java.util.regex.Pattern;

public class CharactersAndQuantifiers {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[abc]*", "ddd"));// f
		System.out.println(Pattern.matches("\\d", "1"));// t
		System.out.println(Pattern.matches("\\D", "1"));// f
		System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "test"));// t
		System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "test"));// f
		System.out.println(Pattern.matches("[a-zA-Z0-9]{2,4}", "test"));// t
		System.out.println(Pattern.matches("[a-zA-Z0-9]{2,4}", "test1"));// f
	}

}
