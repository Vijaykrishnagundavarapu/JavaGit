package vijay77;

public class removecharacters
{
	public static void main(String[]  args) 
	{
		String s1 = "@a$#xis^&ban#!k";
		String P1 = s1.replaceAll("[^a-zA-Z0-9]" , "");
		
		System.out.println(P1);
	}
	

}
