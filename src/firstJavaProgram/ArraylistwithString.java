package firstJavaProgram;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistwithString {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Blue");
		ar.add("Black");
		ar.add("Red");
		ar.add("Yellow");
		ar.add("Purple");

		for (String e : ar) {
			System.out.println(e);
		}

		for (int i = 0; i < ar.size(); i++) {
			System.out.println("Print colour name" + i + ":" + ar.get(i));
		}

		// create an array - place value for first and last position

		int i[] = new int[5];

		i[0] = 3;
//		i[1] = 
//		i[2] = 
//		i[3] = 
		i[4] = 10;

		System.out.println(i[0] + " " + i[4]);

		// update array element by given element
		i[0] = i[4];
		System.out.println(i[0] + " " + i[4]);

		// remove thrid element from array
		ArrayList<Object> ob = new ArrayList<Object>();
		ob.add("Blue");
		ob.add(10);
		ob.add(12.3);
		ob.add(true);
		ob.add("color");

		System.out.println(ob.get(1));
		ob.remove(1);
		System.out.println(ob.get(1));

		// search element in array list
		System.out.println(ob.size());

		boolean bl = ob.contains("color");

		if (bl) {
			System.out.println("Color string present");
		}

		else {
			System.out.println("no color string");
		}

		// reverse string
		Collections.reverse(ob);

		System.out.println(ob);

		// empty arraylist
		ob.clear();
		System.out.println(ob);

		// swap the elements
		int m[] = new int[5];

		m[0] = 3;
		m[1] = 2;
		m[2] = 0;
		m[3] = 6;
		m[4] = 10;

		int temp = m[0];
		m[0] = m[1];
		m[1] = m[temp];

		System.out.println(m[0] + " " + m[1]);

	}

}
