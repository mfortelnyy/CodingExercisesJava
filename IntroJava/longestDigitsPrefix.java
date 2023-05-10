
public class longestDigitsPrefix {
	/*Given a string, output its longest prefix which contains only digits.

Example

For inputString = "123aa1", the output should be
solution(inputString) = "123".

*/

	public static void main(String[] args) {
		String d = "123aa1";
System.out.println(longestPrefixDigits(d));
	}
	public static String longestPrefixDigits(String inputString) {
		char[] a = inputString.toCharArray();
	    String res ="";
	    for(char i : a)
	    {
	        int digit = (int) i;
	        if( digit>47 &&  digit<58)
	        {
	            res = res + String.valueOf(i);
	        }
	        else
	            return res;
	    }
	    return res;
	}

}
