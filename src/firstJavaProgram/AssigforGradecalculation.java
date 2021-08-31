package firstJavaProgram;

public class AssigforGradecalculation {

	public static void main(String[] args) {
		int v=52;
		
		
		if (v>90)
		{
			System.out.println("Grade - A");
		}
			else if (v>=71 && v<=90)
			{
				System.out.println("Grade - B");
			}
		
			else if (v>=50 && v<=70)
			{
				System.out.println("Grade C");
			}
			else
			System.out.println("Fail");
		
		
		 int a = 5;
		  a +=5;
		  
		  switch(a){
		   
		    case 5: System.out.println("5");break;
		    case 10: System.out.println("10");break;
		    default: System.out.println("15");
		    
		  }
		
		  int b = 0;
		  b +=5;
		  
		  switch(b){
		   
		    case 5: System.out.println("5");
		    case 10: System.out.println("10");break;
		    default: System.out.println("0");
		    
		  }

		  
		  int c = 0;
		  c +=5;
		  
		  switch(c){
		   
		    case 5: System.out.println("c5");break;
		    case 10: System.out.println("c10");
		    default: System.out.println("c0");
		    
		  }
		  
		  
		  int d = -5;
		  d +=5;
		  
		  switch(d){
		   
		    case 5: System.out.print("5");break;
		    case 10: System.out.print("10");
		   default: System.out.print("0");
		    
		  }
	}
 
}
