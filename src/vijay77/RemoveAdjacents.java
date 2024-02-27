package vijay77;

public class RemoveAdjacents
{

     public static void main(String[] args)
     {
		        String inputString = "ddabbcggdabb";
		        String removedDuplicates = removeAdjacentDuplicates(inputString);
		        System.out.println("Original String: " + inputString);
		        System.out.println("String with Adjacent Duplicates Removed: " + removedDuplicates);
		    }

		    public static String removeAdjacentDuplicates(String inputString)
		    {
		        StringBuilder result = new StringBuilder();

		        for (char c : inputString.toCharArray()) 
		        {
		            if (result.length() == 0 || c != result.charAt(result.length() - 1)) 
		            {
		                result.append(c);
		            } else {
		                result.deleteCharAt(result.length() - 1);
		            }
		        }

		        return result.toString();

	}
}


