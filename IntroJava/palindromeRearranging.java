import java.util.Arrays;

public class palindromeRearranging {
	/*
	 * Given a string, find out if its characters can be rearranged to form a palindrome.

Example

For inputString = "aabb", the output should be
solution(inputString) = true.

We can rearrange "aabb" to make "abba", which is a palindrome.
	 */

	public static void main(String[] args) {
		System.out.println(palRear("aabb"));

	}
	
	
	public static boolean palRear(String str)
	{
		 int NO_OF_CHARS =256;
	     int count[] = new int[NO_OF_CHARS];
	        Arrays.fill(count, 0);
	 
	        // For each character in input strings,
	        // increment count in the corresponding
	        // count array
	        for (int i = 0; i < str.length(); i++)
	            count[(int)(str.charAt(i))]++;
	 
	        // Count odd occurring characters
	        int odd = 0;
	        for (int i = 0; i < NO_OF_CHARS; i++) {
	            if (count[i]%2 != 0)
		                odd++;
	            if (odd > 1)
	                return false;
	        }
	 
	        // Return true if odd count is 0 or 1,
	        return true;
		
	}

}
