package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {
	
	public static void main(String[] args)
	{
		//HashMap is a class implements the MAP Interface.
		//Extends AbscratctMap
		//it contains only unique elements
		//Store the values - key value -pair 
		//it may have one null key and multiple null values.
		//it maintains no order.
		//HashMap is non-syncronised. : it is used in multithreading concept - can accessible by multiple thread /not thread safe.
		
		//problem : when one thread update the map structure by adding or removing value, then the next thread will get the updated value
		//called fast fail condition
		//concurrent modification exception : Fail fast condition
		//used for Multithreding application to improve the performance.
		
		
		
		HashMap<Integer, String > mp = new HashMap<Integer, String>();
		mp.put(1, "selenium");
		mp.put(2, "QTP");
		mp.put(3, "TestComplete");
		mp.put(4, "RFT");
		
		System.out.println(mp.get(1));
		System.out.println(mp.get(2));
		System.out.println(mp.get(3));
		System.out.println(mp.get(4));		
		System.out.println("**********************************************");
		
		
		//to fetch all values of MAp
		
		for (Entry m : mp.entrySet())								//map.entry interface
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		System.out.println(mp); 		
		System.out.println(mp.remove(3));
		System.out.println(mp);
		
	
		
		Employee e1 = new Employee("tom", "admin", 25);
		Employee e2 = new Employee("peater", "IT", 26);
		Employee e3 = new Employee("steave", "dev", 27);
		
		
		HashMap<Integer, Employee> mp1 = new HashMap<Integer, Employee>();		
		
		mp1.put(1, e1);
		mp1.put(2, e2);
		mp1.put(3, e3);
		
		//print/travrse the HashMap
		
		for (Entry<Integer, Employee> m : mp1.entrySet())
		{
			int key = m.getKey();
			Employee e = m.getValue();
			
			System.out.println("employee " +  key  +  " Info: ");
			System.out.println(e.name +" " +  e.city + " " + e.age);
			
			
		}
		
		
		
		
	}

}
