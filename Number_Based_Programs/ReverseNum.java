package com_jspider.logicalProgramming;

import java.util.Scanner;

public class ReverseNum {
	
	public int reverse(int n){
		int rev= 0;
		while(n>0) {
			int lastdigit = n%10;
			rev = rev*10+lastdigit;
			n=n/10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		ReverseNum  r= new ReverseNum();
		System.out.println(r.reverse(n));
	}


}
