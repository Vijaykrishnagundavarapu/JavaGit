package vijay77;

import java.util.Arrays;

public class StringtoIntegerArray 
{
	public static void main(String[]  args) 
	{
		String [] s1 = {"234" , "3456" , "987"};
		int len = s1.length;
		int [] arr = new int [len];
		for(int i=0; i<len; i++) 
		{
			arr[i] = Integer.parseInt(s1[i]);
		}
		System.out.println(Arrays.toString(arr));
	}

	
}
