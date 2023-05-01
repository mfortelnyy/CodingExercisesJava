
public class avoidObstacles {

	/*
	 * You are given an array of integers representing coordinates of obstacles situated on a straight line.

Assume that you are jumping from the point with coordinate 0 to the right. 
You are allowed only to make jumps of the same length represented by some integer.

Find the minimal length of the jump enough to avoid all the obstacles.

Example

For inputArray = [5, 3, 6, 7, 9], the output should be
solution(inputArray) = 4.
	 */
	public static void main(String[] args) {

		int[] a = { 5, 3, 6, 7, 9};
		System.out.println(avoidObs(a));
	}
	
	public static int avoidObs(int[] inputArray)
	{
		boolean found = false;
	    int i = 1;
	    while(true){
	        found = true;
	        for(int j = 0; j < inputArray.length; j++){
	            if(inputArray[j] % i == 0){
	                found = false;
	            }
	        }
	        if(found){
	            return i;
	        }
	        i++;
	    }
		
	}

}
