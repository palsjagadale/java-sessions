package InterviewPrograms;

public class PrintNameWithoutLoop {

	public static void main(String[] args) {
		String name = "Pallavi";
		String s = "i";
		
		s = s.replaceAll("i", "iiiiiiiiii");			//	i=10;
		s = s.replaceAll("i", "iiiiiiiiii");			//i = 10*10 =100
		s = s.replaceAll("i", "iiiiiiiiii");			//i= 100*10= 1000
		
		s.replaceAll("i", name + "\n");
		System.out.println(s);

	}

}
