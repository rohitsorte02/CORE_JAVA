package com_jspider.logicalProgramming;

public class TernaryOptr {
	
	public static void main(String[] args) {
		int a=10,b=20,c=3,max;
		
		max=(a>b) ? (a>c ? a:c):(b>c ? b:c);
		System.out.println(max);
	}

}
