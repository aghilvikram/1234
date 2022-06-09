package javaprojectvik;

import java.util.stream.IntStream;

public class String1 {

	public static void main(java.lang.String[] args) {
		String str="vikram";
		String s="devi";
		System.out.println(str);
		char c = str.charAt(1);
		System.out.println(c);
		str.concat(s);
		System.out.println(s);
		String r = s.concat(str);
		System.out.println(r);
		int i = s.compareTo(str);
		System.out.println(i);
		boolean contains = s.contains(str);
		System.out.println(contains);
		boolean endsWith = s.endsWith("i");
		System.out.println(endsWith);
		boolean equals = s.equals(s);
		System.out.println(equals);
		int indexOf = s.indexOf("v");
		System.out.println(indexOf);
		String[] split = s.split(s);
		System.out.println(split);
		String substring = s.substring(2);
		System.out.println(substring);
		IntStream chars = s.chars();
		System.out.println(chars);
		int d = s.compareToIgnoreCase(str);
		System.out.println(d);
	}

}
