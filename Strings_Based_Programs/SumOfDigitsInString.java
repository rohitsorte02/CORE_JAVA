package com_jspider.stringBasedProgramming;

public class SumOfDigitsInString {
	
	public static int digitsFromString(String s) {
		String num = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				num = num + s.charAt(i);
			}
		}
		int n = Integer.parseInt(num);
		return sumOfDigits(n);
	}
	public static int sumOfDigits(int n) {
		int sum = 0;
		while (n > 0) {
			int lastDigit = n % 10;
			sum = sum + lastDigit;
			n = n / 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		String s = "R02o04h19i99t";
		System.out.println(digitsFromString(s));
	}
}
