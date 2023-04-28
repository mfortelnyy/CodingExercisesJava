
public class alternatingSums {
	/*
	 * Several people are standing in a row and need to be divided into two teams. 
	 * The first person goes into team 1, the second goes into team 2, the third goes 
	 * into team 1 again, the fourth into team 2, and so on.

You are given an array of positive integers - the weights of the people.
 Return an array of two integers, where the first element is the total weight of team 1, 
 and the second element is the total weight of team 2 after the division is complete.

Example

For a = [50, 60, 60, 45, 70], the output sho
	 */

	public static void main(String[] args) {
		int[] a = { 50, 60, 60, 45, 70};
		int[] b =altSum(a);
		for(int i: b)
			System.out.println(i);

		
		
	}
	
	
	public static int[] altSum(int[] a) {
		int[] res = new int[2];
	    int team1 = a[0];
	    int team2;
	    if(a.length==1)
	    {
	        team2 = 0;
	    }
	    else
	    {
	        team2 = a[1];
	    }
	     
	    
	    for(int i =2; i< a.length; i++)
	    {
	        if(i%2 == 0)
	        {
	            team1= team1+ a[i];
	        }
	        else
	            team2 = team2+ a[i];
	        
	    }
	    
	    res[0] = team1;
	    res[1] = team2;
	    
	    return res;
		
	}

}
