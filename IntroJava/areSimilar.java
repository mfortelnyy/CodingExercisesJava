import java.util.*;

public class areSimilar {
	/*
	 * Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.

Given two arrays a and b, check whether they are similar.

Example

For a = [1, 2, 3] and b = [1, 2, 3], the output should be
solution(a, b) = true.

The arrays are equal, no need to swap any elements.

For a = [1, 2, 3] and b = [2, 1, 3], the output should be
solution(a, b) = true.

We can obtain b from a by swapping 2 and 1 in b.

For a = [1, 2, 2] and b = [2, 1, 1], the output should be
solution(a, b) = false.

Any swap of any two elements either in a or in b won't make a and b equal.
	 */

	public static void main(String[] args) {
		int[] a = {1, 2, 1, 2};
		int[] b = {2, 2, 1, 1};
		
		System.out.println(solution(a, b));
		

	}

	

public static boolean solution(int[] a, int[] b)
{
		HashMap<Integer, Integer> hasha = new HashMap<>();
	    HashMap<Integer, Integer> hashb = new HashMap<>();
	    
	    
	    for(int i=0; i< a.length; i++)
	    {
	        if(hasha.containsKey(a[i]))
	            hasha.put(a[i], hasha.get(a[i])+ 1);
	        else
	            hasha
	            .put(a[i], 1);
	        
	    }
	    
	    
	    for(int i=0; i< b.length; i++)
	    {
	        if(hashb.containsKey(b[i]))
	            hashb.put(b[i], hashb.get(b[i] + 1));
	        else
	            hashb.put(b[i], 1);
	    }
	    
	    int count =0;
	    
	    for(Map.Entry<Integer, Integer> i : hasha.entrySet())
	    {
	        if(i.getValue() == hashb.get(i.getKey()))
	            count++;
	    }
	    
	    if(count == hasha.size() && hasha.size() == hashb.size())
	        return true;
	    else
	        return false;
}
}

