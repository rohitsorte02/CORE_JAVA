package numberBasedProgramming;

public class Calculator {
//	private int res;
//	static method void type
	public static void addTwoNumber(int a, int b) {
		int res = a+b;
		System.out.println(res+"is sum of two number");
	}
//non-static method-void type
	public void subTwoNumber(int a, int b) {
		int res = a-b;
		System.out.println(res + "is sub of two number");
//		return res;
	}
//static int return type
	
	public static int proTwoNumber(int a, int b) {
		int pro = a*b;
		return pro;
	}
	
//non-static double 
	public int divideTwoNumber(int a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		
		
//		
//		Calculator calculator =new Calculator();
//		calculator.subTwoNumber(30, 20);//sub two number
		
		
		
		addTwoNumber(10, 20);// add two number
		
		
		
//		int pro =proTwoNumber(10, 10);//product of 2 number
//		System.out.println(pro +"product of the 2 number");
		
		
		
//		int result = calculator.divideTwoNumber(20, 10);//division of 2 numbers
//		System.out.println(result + "division of 2 number");
//		
	}


}
