
public class reverseInParentheses {
	/*
Write a function that reverses characters in (possibly nested) parentheses in the input string.

Input strings will always be well-formed with matching ()s.

Example

For inputString = "(bar)", the output should be
solution(inputString) = "rab";
For inputString = "foo(bar)baz", the output should be
solution(inputString) = "foorabbaz";
For inputString = "foo(bar)baz(blim)", the output should be
solution(inputString) = "foorabbazmilb";
For inputString = "foo(bar(baz))blim", the output should be
solution(inputString) = "foobazrabblim".
Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
	 */

	public static void main(String[] args) {

		
		System.out.println(reverseinpar
				("foo(bar)bag"));
	}

	
	public static String reverseinpar(String inputString) {
		int first = inputString.lastIndexOf('(');
	    int last = inputString.indexOf(')', first);
	    
	    while(first != -1)
	    {
	        String rev = new StringBuilder(inputString.substring(first+1, last)).reverse().toString();
	        String part1 = inputString.substring(0, first);
	        String part2 = inputString.substring(last+1);
	        inputString = part1 + rev + part2;
	        first = inputString.lastIndexOf("(");
	        last = inputString.indexOf(")", first);
	    }     
	return inputString;
		
	}
}
