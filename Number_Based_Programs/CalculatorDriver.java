package com_jspider.logicalProgramming;

public class CalculatorDriver {
	public static void main(String[] args) {
		Calculator.addTwoNumber(20, 30);
		
		Calculator sub = new Calculator();
		sub.subTwoNumber(80, 10);
		
		int pro = Calculator.proTwoNumber(10, 20);
		System.out.println(pro+"is pro of twonumber");
		
		Calculator div = new Calculator();
		System.out.println(div.divideTwoNumber(1000, 10)+"is div of two number");
		
		
		
		
		
	}

}
