
public class isLucky {
	
	/*
	 * Ticket numbers usually consist of an even number of digits. 
	 * A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.
	 * Given a ticket number n, determine if it's lucky or not.

			Example

For n = 1230, the output should be
solution(n) = true;
For n = 239017, the output should be
solution(n) = false.
	 */

	public static void main(String[] args) {
		
		System.out.println(isLuck(1230));

	}
	
	
	public static boolean isLuck(int n)
	{
		char[] p = Integer.toString(n).toCharArray();

		int leftsum =0;
		int rightsum =0;
		int mid= p.length/2; // not included

		for(int i =0; i< p.length; i++)
		{
		    if(i<mid)
		    {
		    leftsum+=Character.getNumericValue(p[i]);
		    }
		    else
		        rightsum+=Character.getNumericValue(p[i]);
		}

		if(rightsum == leftsum)
		    return true;
		else
		    return false;

	}

}
