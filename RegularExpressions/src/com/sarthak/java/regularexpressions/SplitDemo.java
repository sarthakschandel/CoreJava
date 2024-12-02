package com.sarthak.java.regularexpressions;

import java.util.regex.Pattern;

public class SplitDemo {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("[.]");
		String[] words = pattern.split("www.bharaththippireddy.com");

		String s = "www.bharaththippireddy.com";
		String[] words2 = s.split("[.]");// delimiter hai ye
		for (String word : words2) {
			System.out.println(word);
		}
	}

}
