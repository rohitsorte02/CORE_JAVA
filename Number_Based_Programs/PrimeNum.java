package com_jspider.logicalProgramming;

import java.util.Scanner;

public class PrimeNum {


	public static boolean primeNum(int n) {
	 int count =0;
		for(int i=1;i<=n;i++) {
		
			if(n%i==0) {
				count++;
			}
		}
			if(count==2) {
				return true;
			}
			else {
				return false;
			}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		PrimeNum  p= new PrimeNum();
		boolean res = primeNum(n);
		System.out.println(res);
	}
}
