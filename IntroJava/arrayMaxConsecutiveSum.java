
public class arrayMaxConsecutiveSum {
	/*
	 * Given array of integers, find the maximal possible sum of some of its k consecutive elements.

Example

For inputArray = [2, 3, 5, 1, 6] and k = 2, the output should be
solution(inputArray, k) = 8.
All possible sums of 2 consecutive elements are:

2 + 3 = 5;
3 + 5 = 8;
5 + 1 = 6;
1 + 6 = 7.
Thus, the answer is 8.
	 */

	public static void main(String[] args) {
		int[] a = {2, 3, 5, 1, 6};
		int k = 2;
		System.out.println(arrayMaxConsSum(a, k));
	}
	
	public static int arrayMaxConsSum(int[] inputArray, int k) {
		int max =0;
		for(int i=0; i<inputArray.length-k+1; i++)
	    {
	        int sum =sumofk(inputArray, i, k);
	        if(max<sum)
	        {
	            max = sum;
	        }
	        
	    }
	    return max;
	}
	
	public static int sumofk(int[] a, int i, int k) {
		int sum=0;
	    for(int j =0; j<k;j++)
	    {
	        sum=sum+a[i];
	        i++;
	    }
	    return sum;
		
	}

}
