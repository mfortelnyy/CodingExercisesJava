
public class absoluteValuesSumMinimization {
	/*
	 * Given a sorted array of integers a, your task is to determine which element 
	 * of a is closest to all other values of a. In other words, find the element x in a, which minimizes the following sum:

abs(a[0] - x) + abs(a[1] - x) + ... + abs(a[a.length - 1] - x)
(where abs denotes the absolute value)

If there are several possible answers, output the smallest one.
	 */

	public static void main(String[] args) {
		int[] a = { 2, 4, 7};
		int[] b = {2, 3};
		System.out.println(absValSumMin(b));
	}

	public static int absValSumMin(int[] a) {
		 int sum=0;
		    for(int i=0; i<a.length; i++)
		    {
		       sum= sum+ Math.abs(a[i]-a[0]);
		    }
		    
		    int min = sum;
		    //sum = 0;
		    int index=0;
		    for(int i=1; i< a.length; i++)
		    {
		        sum=0;
		        for(int j=0; j<a.length; j++)
		        {
		            sum = sum+ Math.abs(a[j] - a[i]);
		            //System.out.println(sum);
		            
		        }
		        if(sum<min)
		            {
		                min =sum;
		                index = i;
		            }
		    }
		    return a[index];
	}
}
