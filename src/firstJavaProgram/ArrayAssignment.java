package firstJavaProgram;

public class ArrayAssignment {

	public static void main(String[] args) {

//		String name;
//		int age;
//		String teamname;
//		String dob;
//		char gender;
//		double StrikeRate;
//		boolean isactive;

		Object ob[] = new Object[7];
		ob[0] = "pallavi";
		ob[1] = 30;
		ob[2] = "Automation";
		ob[3] = "25-06-1986";
		ob[4] = 'F';
		ob[5] = 25.30;
		ob[6] = true;

		for (int i = 0; i < ob.length; i++) {
			System.out.println(i + ": " + ob[i]);
		}

		System.out.println("*******************************");

		// while loop - print static array using object class
		Object ob1[] = new Object[7];
		ob1[0] = "Sachin";
		ob1[1] = 35;
		ob1[2] = "Cloud";
		ob1[3] = "21-04-1982";
		ob1[4] = 'M';
		ob1[5] = 85.30;
		ob1[6] = false;

		int b = 0;
		while (b < ob1.length) {
			System.out.println(ob1[b]);
			b++;
		}

		System.out.println("*******************************");

		// for each loop - print static array using object class
		Object ob2[] = new Object[7];
		ob2[0] = "Advay";
		ob2[1] = 15;
		ob2[2] = "Devops";
		ob2[3] = "25-06-1990";
		ob2[4] = 'M';
		ob2[5] = 85.30;
		ob2[6] = true;	
		
		for(Object e : ob2)
		{
			System.out.println(e);
		}
		
		

	}

}
