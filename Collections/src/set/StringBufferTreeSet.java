package set;

import java.util.Set;
import java.util.TreeSet;

import comparator.SBComparator;//package name then class name

public class StringBufferTreeSet {

	public static void main(String[] args) {

		Set<StringBuffer> set = new TreeSet<>();

		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("xyz"));
		set.add(new StringBuffer("def"));
		set.add(new StringBuffer("mno"));

		for (StringBuffer obj : set) {
			System.out.println(obj);
		}
		
		//since java 11 string buffer supports comparable interface :)
		//pehle class cast exception throw karta tha

		Set<StringBuffer> set1 = new TreeSet<>(new SBComparator());

		set1.add(new StringBuffer("abc"));
		set1.add(new StringBuffer("xyz"));
		set1.add(new StringBuffer("def"));
		set1.add(new StringBuffer("mno"));

		for (StringBuffer obj : set1) {
			System.out.println(obj);
		}

	}

}
