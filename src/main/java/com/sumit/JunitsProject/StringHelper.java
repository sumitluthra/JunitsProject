package com.sumit.JunitsProject;

public class StringHelper {

	public static void main(String[] args) {
		StringHelper helper = new StringHelper();
		System.out.println(helper.truncateAInFirst2Poitions("Aas"));
	}
	public String truncateAInFirst2Poitions(String str) {

		if (str.length() <= 2)
			return str.replaceAll("A", "");

		String first2Chars = str.substring(0, 2);
		System.out.println(first2Chars);
		String stringMinusFirst2Chars = str.substring(2);
		System.out.println(stringMinusFirst2Chars);
		return first2Chars.replaceAll("A", "") + stringMinusFirst2Chars;
	}
}
