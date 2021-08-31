package firstJavaProgram;

public class dataTypes {

	public static void main(String[] args) {
		// Data Types : print Hello followed by name Naveen K

		System.out.println("Hello");
		System.out.println("Naveen K");

		System.out.println("****************");

		// Print Sum of 2 numbers
		int firstnumber = 74;
		int secondnumber = 36;
		int sum;

		sum = firstnumber + secondnumber;

		System.out.println("print sum:" + sum);

		System.out.println("****************");

		// divide two numbers : 50/3

		int firstNumber = 50;
		int secondNumber = 3;

		int divideResult = firstNumber / secondNumber;
		System.out.println("print divide result :" + divideResult);

		System.out.println("****************");

		// contact sting and char : Hello selenium and t

		System.out.println("contact Hello selenium and char t : " + ("Hello Selenium") + ('t'));

		System.out.println("****************");

		// add variable sum and concatenate with string and result : Your Total amount
		// is. 3700.

		int v = 100;
		int w = 200;
		int x = 3400;

		int add = v + w + x;

		String s = "Your Total amount is";

		System.out.println(s + "." + add);

		System.out.println("****************");

	}

}
