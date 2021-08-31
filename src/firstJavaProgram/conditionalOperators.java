package firstJavaProgram;

import java.util.Scanner;

public class conditionalOperators {

	public static void main(String[] args) {
		// take input from user and find greatest number.

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number:");

		int a = sc.nextInt();

		System.out.println("Enter second number:");
		int b = sc.nextInt();

		System.out.println("Enter Third number:");
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("a is greater tha b and c");
		}

		else if (b > c) {
			System.out.println("b is greater than c");

		}

		else {
			System.out.println("c is greater tha a and b");
		}

		System.out.println("*****************************************************");

		// Take input from user and : find number is positive or negative.

		System.out.println("Enter 1st number :");
		int p = sc.nextInt();

		if (p >= 0) {
			System.out.println("print number is positive");
		}

		else {
			System.out.println("print number is negative");
		}
//
		System.out.println("***********************************");
		
		//find out odd and even number
		
		System.out.println("Enter any number");
		int result = sc.nextInt();
		
		if (result % 2 ==0) {
			System.out.println("print number is even");
		}
		
		else
		{
			System.out.println("number is odd");
		}
		
		sc.close();
	}

}
