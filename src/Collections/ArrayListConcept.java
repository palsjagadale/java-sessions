package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		//int a[] = new int [3];              //static array
		
		//ArraList :Dynamic array		//
		// No Fixed Size	
		//can contain null and duplicate values.
		//can allow ranom access for element because it stores values basis of index.
					 
		
			
		
		  ArrayList ar = new ArrayList(); ar.add(200); ar.add(300); ar.add(600);
		  
		  System.out.println(ar.size());
		  
		  for (int i=0; i<ar.size(); i++) { System.out.println(ar.get(i)); }
		 
		
		
		  ArrayList<Integer> ar1 = new ArrayList<Integer>(); ar1.add(200);
		  ar1.add(300); ar1.add(600);
		  
		  for (int i=0; i<ar1.size(); i++) { System.out.println(ar1.get(i)); }
		  
		  
		  ArrayList<String> ar2 = new ArrayList<String>(); ar2.add("abc");
		  ar2.add("test"); ar2.add("Hello");
		  
		  
		  ArrayList<String> ar3 = new ArrayList<String>(); ar2.add("abc");
		  ar2.add("test"); ar2.add("Hello");
		  
		  ar2.addAll(ar3); System.out.println(ar2.size()); for (int i=0; i<ar2.size();
		  i++) {
		  
		  System.out.println(ar2.get(i)); }
		  
		  System.out.println("******************************");
		  
		  
		  ar2.removeAll(ar3); System.out.println(ar2.size()); for (int i = 0; i <
		  ar2.size(); i++) {
		  
		  System.out.println(ar2.get(i));
		  
		  }
		 
		  
		  System.out.println("*******************constructor values****************");
		 
		 ArrayList<Employee> ar4 = new ArrayList<Employee>();
		
		Employee ep1 = new Employee("Pallavi", "pune", 27);
		Employee ep2 = new Employee("test", "mumbai", 29);
		Employee ep3 = new Employee("qa", "bang", 30);
		
		
		ar4.add(ep1);                                                        
		ar4.add(ep2);
		ar4.add(ep3);
		
		//System.out.println(ar4.size());
		
		Iterator<Employee> it =  ar4.iterator();
		while (it.hasNext());
		{
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.city);
			System.out.println(emp.age);			
			
		}
		
		
		
		
		 
		

	}

}
