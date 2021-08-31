package firstJavaProgram;

public class Increment_Decrement {

	public static void main(String[] args) {
		//post-increment
		
		int a= 1;
		int b=a++;
		
		System.out.println("value of :" + a);
		System.out.println("value of b:" + b);
		
		
		
		//pre-increment 
		
		int c=1;
		int d=++c;
		
		System.out.println("value of :" + a);
		System.out.println("value of d:" + d);
		
		
		
		int t=1;
		System.out.println("value of t:" + t++);
		System.out.println("value of t:" + t);
		
		
		
		//post decement 
		
		int p=2;
		int q=p--;
		
		System.out.println("print value of p" +p);
		System.out.println("print value of :" + q);
				
		
		//pre decrement
		
		int s1=2;
		int s2= --s1;
		
		System.out.println("print value of s1:" + s1); //1
		System.out.println("print value of s2:" + s2); //1
		
		int v=1;
		System.out.println( ++v + v++); //4
		System.out.println(v); //3
		
		int mm=1;
		System.out.println(mm++ + 4);
		System.out.println(mm);

	}

}
