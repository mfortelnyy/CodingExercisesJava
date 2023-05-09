import java.util.HashMap;

public class differentSymbolsNaive {
	/*
	 * Given a string, find the number of different characters in it.

Example

For s = "cabca", the output should be
solution(s) = 3.

There are 3 different characters a, b and c.
	 */

	public static void main(String[] args) {
		System.out.println(diffSyms("cabca"));
	}
	
	public static int diffSyms(String s) {
		char[] a = s.toCharArray();
	    
	    HashMap<Character, Integer> uni = new HashMap<Character, Integer>();
	    
	    for(int i =0; i<a.length; i++)
	    {
	        if(uni.containsKey(a[i]))
	            uni.put(a[i], uni.get(a[i])+1);
	        else
	            uni.put(a[i], 0);
	    }
	    
	    return uni.size();
	}

}
