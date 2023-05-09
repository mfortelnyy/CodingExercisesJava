
public class firstDigit {
	/*
	 * Find the leftmost digit that occurs in a given string.

Example

For inputString = "var_1__Int", the output should be
solution(inputString) = '1';
For inputString = "q2q-q", the output should be
solution(inputString) = '2';
For inputString = "0ss", the output should be
solution(inputString) = '0'.
	 */

	public static void main(String[] args) {
		System.out.println(fDig("var_1__Int"));

	}

	public static char fDig(String inputString) {

        char[] a = inputString.toCharArray();
        for(int i =0; i< a.length; i++)
        {
            if(String.valueOf(a[i]).matches("[0-9]") )
                return a[i];
        }
        return ' ';
    
		
	}
}
