package numberBasedProgramming;

import java.util.Scanner;

public class RelationalOptr {
	
	public static void main(String[] args) {
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("a<b: ? = "+(a<b));
		
		System.out.println("a>b: ? = "+(a>b));
		
		System.out.println("a<=b: ? = "+(a<=b));
		
		System.out.println("a>=b: ? = "+(a>=b));
		
		System.out.println("a==b: ? = "+(a==b));
		
		System.out.println("a!=b: ? = "+(a!=b));
	}
	

}
