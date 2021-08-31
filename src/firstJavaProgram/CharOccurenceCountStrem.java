package firstJavaProgram;

public class CharOccurenceCountStrem {

	public static void main(String[] args) {
		
		String str = "Testing Solutions";
		
		long count = str.chars().filter(e -> (char)e=='i').count();
		
	System.out.println(count);		
		//watch : https://www.youtube.com/watch?v=kmSljbXih_Q

	}

}
