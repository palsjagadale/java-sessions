package Collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashtableConcept {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//It is similer to HashMpa but it is syncronised.
		//stores unique values - no null key and null value 
		//store the value on basis of key and value.
		//key will be stored in the form of an object -
		//Hashcode - it is java object number.32 bit integer number
		
		Hashtable ht = new Hashtable();
		ht.put(1, "Tom");
		ht.put(2, "test");
		ht.put(3, "Java");
		ht.put(3, "Java");                          //contains unique value 
		//ht.put(null, "Java");						//NPE
		//ht.put(3, null);							//NPE
		
		
		//create a clone/shallow copy of hashtable
		
		Hashtable ht1 =  new Hashtable();
		ht1= (Hashtable)ht.clone(); 
		System.out.println("the values from h1 "+ ht);
		System.out.println("the values from h1 "+ ht1);
		
		ht.clear();
		System.out.println("the values from h1 "+ ht);
		System.out.println("the values from h1 "+ ht1);
		
		
		//contains value : 		
		
		Hashtable ht3 = new Hashtable();
		ht3.put("A", "Naveen");
		ht3.put("B", "Manager");
		ht3.put("C", "selenium");
		
		if (ht3.contains("Naveen"))
		{
			System.out.println("found");
						
		}
		//Print all values from HashTable using ----Enumeration  -----elements()
		
			Enumeration e = ht3.elements();
			System.out.println("print values from ht3 :");
			
			while (e.hasMoreElements())
			{
				System.out.println(e.nextElement());
			}
			
			
			////Print all values from HashTable using ----Entryset  ----
			
			Set s = ht3.entrySet();
			System.out.println(s);
			
			
			//Check both hashtable equal or not
			
			Hashtable ht4 = new Hashtable();
			ht4.put("A", "Naveen");
			ht4.put("B", "Manager");
			ht4.put("C", "selenium");
			
			if (ht3.equals(ht4)) {
				System.out.println("equals");
			}
			
			//get the values from key
			System.out.println(ht1.get(1));
			
			//get the Hashcode of Hashtable object 
			System.out.println("Hashcode value of ht1:" + ht1.hashCode());

	} 

}
