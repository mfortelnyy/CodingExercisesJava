
public class arrayChange {
	
	/*
	 * You are given an array of integers. On each move you are allowed to increase exactly one of its element by one.
	 *  Find the minimal number of moves required to obtain a strictly increasing sequence from the input.

Example

For inputArray = [1, 1, 1], the output should be
solution(inputArray) = 3.
	 */

	public static void main(String[] args) {
		int[] a = {1, 1, 1};
		
		System.out.println(arrChange(a));

	}

	
	public static int arrChange(int[] inputArray)
	{
		int count =0;
	    for(int i =0; i < inputArray.length-1; i++)
	    {
	        if(inputArray[i+1] == inputArray[i])
	        {
	            inputArray[i+1] = inputArray[i+1]+1;
	            count++;
	        }
	        
	        if(inputArray[i+1]>inputArray[i]) continue;
	        
	        if(inputArray[i+1]<inputArray[i])
	        {
	            count = count + (inputArray[i] - inputArray[i+1] + 1);
	            inputArray[i+1] = inputArray[i+1] + inputArray[i] - inputArray[i+1] + 1;
	        }
	    }
	    
	    return count;
	}
}
