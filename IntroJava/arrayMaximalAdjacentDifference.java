import java.util.Iterator;

public class arrayMaximalAdjacentDifference {
	/*
	 * Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.

Example

For inputArray = [2, 4, 1, 0], the output should be
solution(inputArray) = 3.
	 */

	public static void main(String[] args) {
		int[] a = {2, 4, 1, 0};

		System.out.println(maxAdjDiff(a));
	}
	
	public static int maxAdjDiff(int[] a)
	{
		int maxdif = 0;
		
		for (int i = 0; i < a.length-1; i++) {
			int dif=Math.abs(a[i]-a[i+1]);
		
			if(dif>maxdif)
				maxdif=dif;
		}
		
		return maxdif;
	}

}
