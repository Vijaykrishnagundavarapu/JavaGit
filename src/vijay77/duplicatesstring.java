package vijay77;

public class duplicatesstring 
{
	public static void main(String[] args) 
	{
		String s1 = "aabaarbarccrabmq";
		String s2 = "";
		int len = s1.length();
		char ch;
		for(int i=0; i<len; i++)
		{
			StringBuilder result = new StringBuilder();
			ch= s1.charAt(i);
			if(i == len - 1 || ch != s1.charAt(i + 1))
			{
				result.append(ch);
				System.out.print(result);
			}else 
			{
				while (i < len - 1 && ch == s1.charAt(i + 1)) 
				{
					i++;
				
				}
			}
		}
				
		
	}
}