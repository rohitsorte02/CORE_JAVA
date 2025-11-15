package numberBasedProgramming;

import java.util.Scanner;

public class LogicalOptr {
	public static void main(String[] args) {
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.println("AND Operator");
		System.out.println(a>b && a>c);
		
		System.out.println("OR Operator");
		System.out.println(a>b || a>c);
		
		System.out.println("NOT Operator");
		System.out.println(!(a>b));
		
	}
	
	

}
