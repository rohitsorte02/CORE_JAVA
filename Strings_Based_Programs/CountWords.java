package com_jspider.stringBasedProgramming;

public class CountWords {
	
	public static int countWords(String s) {
		int count=1;
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)==' ' &&  s.charAt(i+1)!=' ') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String s = "My name is Rohit Anant Sorte";
		System.out.println("Given String contains "+countWords(s)+ " Words");
	}

}
