package com_jspider.logicalProgramming;

import java.util.Scanner;

public class Swap {
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;

		System.out.println("A:- "+ a);
		System.out.println("B:- "+ b);	
		
	}
	
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter 1st number ");
		int a = sc1.nextInt();

		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter 2nd number ");
		int b = sc2.nextInt();
		
		swap(a, b);
	}

}
