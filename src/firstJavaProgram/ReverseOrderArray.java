package firstJavaProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class ReverseOrderArray {

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<String>();

		str.add("MAM");
		str.add("SOS");
		System.out.println(str);
		Iterator<String> it = str.iterator();
		if (it.hasNext()) {// check if iterator has the elements
			System.out.println(it.next());// printing the element and move to next

		}
	}
}
