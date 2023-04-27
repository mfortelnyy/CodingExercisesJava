
public class allLongestStrings {
	
	/*
	 * Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
solution(inputArray) = ["aba", "vcd", "aba"].
	 */

	public static void main(String[] args) {
		String[] a = {"aba", "aa", "ad", "vcd", "aba"};
		
		String[] res = solution(a);
		for(String i: res)
			System.out.println(i);
	}

	public static String[] solution(String[] inputArray)
	{
		int maxLength = 0;
	    int count = 0;
	    for(int i=0; i < inputArray.length; i++)
	    {
	        int curLength = inputArray[i].length();
	        if (curLength> maxLength)
	        {
	            maxLength = curLength;
	            count = 0;
	        }
	        if(curLength == maxLength)
	            count++;
	    }
	    String[] res = new String[count];
	    int k=0;
	    for(int i=0; i <inputArray.length; i++)
	    {
	        if(inputArray[i].length() == maxLength)
	        {
	            res[k] = inputArray[i];
	            k++;
	        }
	    }
	    
	    return res;
	}
	
}
