
public class adjacentElementsProduct {

	/*
	 * Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Example

For inputArray = [3, 6, -2, -5, 7, 3], the output should be
solution(inputArray) = 21.

7 and 3 produce the largest product.
	 */
	public static void main(String[] args) {

		int[] a = {3, 6, -2, -5, 7, 3};
		
		System.out.println(solution(a));
	}
	
	
	public static int solution(int[] inputArray)
	{
		int max_prod = Integer.MIN_VALUE;
	    for(int i=0; i < inputArray.length-1; i++)
	    {
	        if(inputArray[i]*inputArray[i+1] > max_prod)
	            max_prod = inputArray[i]*inputArray[i+1];
	    }
	    return max_prod;
	}

}
