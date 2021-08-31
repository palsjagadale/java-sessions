package firstJavaProgram;

public class IfElsestatement {

	public static void main(String[] args) {
		// comparison
		
		int i=20;
		
		if( i==10)
		{
			System.out.println("number is correct");
		}
		
		else
		{
			System.out.println("number is incorrect");
		}

		
		
		
		if (true)
		{
			System.out.println("pass");
		}
//		else 
//		{
//			System.out.println("Fail");
//		}
		
		
		
		///find greater number

		int a=20;
		int b =30;
		int c= 15;

		
		if (a>b && a>c)
		{
			System.out.println("a is greater number");
			
		}
		
		else if (b>c)
		{
			System.out.println("b is greate number ");
		}
	
		
		else 
		{
			System.out.println("c is greater number");
		}
		
	
		
	int marks=10;
	
	switch(marks)
	{
	case 1:
		System.out.println("case1");
		break;
	case 2:
		System.out.println("case2");
	break;
	
	case 10:
		System.out.println("case10");
		break;
		
		default:
			System.out.println("number incorrect");
		break;
	}
		
	
	int f=70;
	
	if (f<=100)
	{
		if (f >=90)
		{
		System.out.println("Grade A");	
		}
		else
			System.out.println("incorrect marks");
	}	
	
	
	int v=49;
			
			
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
	
	

}
}



