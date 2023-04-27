
public class almostIncreasingSequence {
	/*
	 * Given a sequence of integers as an array, determine whether it is possible to obtain 
	 * a strictly increasing sequence by removing no more than one element from the array.

Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. 
Sequence containing only one element is also considered to be strictly increasing.

Example

For sequence = [1, 3, 2, 1], the output should be
solution(sequence) = false.

There is no one element in this array that can be removed in order to get a 
strictly increasing sequence.

For sequence = [1, 3, 2], the output should be
solution(sequence) = true.

You can remove 3 from the array to get the strictly increasing sequence [1, 2]. A
lternately, you can remove 2 to get the strictly increasing sequence [1, 3].
	 */

	public static void main(String[] args) {
		int[] a = {1, 3, 2, 1};
		int[] b = {1, 3, 2};
		System.out.println(isAlmostInc(a));
		System.out.println(isAlmostInc(b));
	}
	
	public static boolean isAlmostInc(int[] sequence)
	{
		int removed = 0;
		
		for (int i = 0; i < sequence.length - 2 && removed <= 2; i ++) {
	        int a = sequence[i];
	        int b = sequence[i+1];
	        int c = sequence[i+2];

	        if (a >= b) {
	            removed++;
	            sequence[i] = b -1;
	        } 

	        if (b >= c){
	            removed++;

	            if (a == c) {
	                sequence[i+2] = b +1;
	            } else {
	                sequence[i+1] = a;
	            }
	        }
	    }

	    return removed <= 1;
	}

}
