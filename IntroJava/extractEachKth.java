import java.util.Arrays;

public class extractEachKth {
	/*
	 * Given array of integers, remove each kth element from it.

Example

For inputArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and k = 3, the output should be
solution(inputArray, k) = [1, 2, 4, 5, 7, 8, 10].
	 */

	public static void main(String[] args) {
		int[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 8 ,9, 10};
		int k =3;
		System.out.println(Arrays.toString(extractKth(inputArray, k)));

	}
	
	public static int[] extractKth(int[] inputArray, int 
			k) {
		int to_be_deleted = inputArray.length / k;
	    int[] res = new int[inputArray.length-to_be_deleted];
	    int j=0;
	    for(int i=0; i< inputArray.length; i++)
	    {
	        if((i+1)%k ==0)
	        {
	            continue;
	            
	        }
	        else
	        {
	            res[j] = inputArray[i];
	            //System.out.println(res[j]);
	            j++;
	        }
	    }
	    return res;
	}

}
