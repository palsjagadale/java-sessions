package firstJavaProgram;

public class Loopprogram {

	public static void main(String[] args) {

		// print I am Batman 5 times

		for (int i = 1; i <= 5; i++) {

			System.out.println("I am a Batman");
		}

		System.out.println("****************");

		// print I am a Batman 1- to 9
		for (int m = 1; m <= 9; m++) {

			System.out.println("I am a Batman" + m);
		}

		System.out.println("****************");

		// for loop - print 10-1

		for (int j = 10; j >= 1; j--)

		{
			System.out.println("print j value: " + j);
		}

		System.out.println("****************");

		// while loop - print 10-1
		int a = 10;
		while (a > 0) {
			System.out.println("value of a :" + a);
			a--;
		}

		System.out.println("****************");

		// while do - print 10-1

		int k = 10;
		do {
			System.out.println("print value of k:" + k);
			k--;
		} while (k > 0);

		System.out.println("****************");

		// Print "Hello World" 10 times

		for (int n = 0; n <= 10; n++) {
			System.out.println("Hello World: " + n);

		}

		System.out.println("****************");

		// WAP - while loop- print 1-10 but quit if multiple of 7 is encountered.

		int g = 1;

		while (g <= 10) {
			System.out.println("print value if g:" + g);
			g++;

		}

		System.out.println("****************");

	}

}
