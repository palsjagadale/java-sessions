package InterviewPrograms;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		  
		String newString= "This is my java code " ;
		
				System.out.println(newString);			
								
				System.out.println(newString.length());
				System.out.println(newString.charAt(4));
				//System.out.println(newString.charAt(28));			//StringIndexOutOfBox Exception				
				System.out.println(newString.indexOf('m'));
				System.out.println(newString.indexOf("code"));
				System.out.println(newString.indexOf("Pallavi"));			//-1
				
				
				System.out.println(newString.indexOf('i')); 			//first occurrence of i				
				System.out.println(newString.indexOf('i', newString.indexOf('i')+1));			//2nd 	occurrence of i
				
				
				
				
				System.out.println(newString.trim());
				System.out.println(newString.replaceAll("\\s+", ""));
				
				
				String mesg = "Welcome Admin";
				
				if (mesg.indexOf("Admin")>0);
				
				{
					System.out.println("Admin user is loged in");
				}
				
				
				
					
				String noWhiteSpaceString ="";				
				
				for(int i=1; i<newString.length(); i++)
				{
					if ((newString.charAt(i)!=' ') && (newString.charAt(i)!='\t'))
					{
						noWhiteSpaceString = noWhiteSpaceString + newString.charAt(i);
					}
					
				}
				
				System.out.println(noWhiteSpaceString);
				
							

	}
}


