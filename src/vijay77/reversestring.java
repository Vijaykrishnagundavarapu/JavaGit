package vijay77;

public class reversestring 
{
	public static void main(String[]  arg) 
	{
		String s1= "vijaykrishna";
		String rs1="";
		char ch;
	     
	       
		for(int i = 0; i<s1.length(); i++) 
		{
			ch= s1.charAt(i);
	        rs1= ch+rs1;
			
		}
		System.out.println("Reversed word:" + rs1);
	}
	


}
