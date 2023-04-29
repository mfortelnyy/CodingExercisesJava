
public class addBorder {
	/*Given a rectangular matrix of characters, 
	 * add a border of asterisks(*) to it.

Example

For

picture = ["abc",
           "ded"]
the output should be

solution(picture) = ["*****",
                     "*abc*",
                     "*ded*",
                     "*****"] 
                     */

	public static void main(String[] args) {
		String[] a = {"abc","ded"};
		String[] res = solution(a);
		for(String i:res )
			System.out.println(i);
	}
	
	public static String[] solution(String[] picture)
	{
		int newLength = picture.length +2; //rows
	    int stringLength = picture[0].length(); //cols
	    int index = 0;
	    String[] res  = new String[newLength];
	    for(int i=0; i< res.length; i++)
	    {
	        if(i==0 || i == newLength-1)
	        {
	            res[i] = asterisksGenertator(stringLength+2);
	        }
	        else
	        {
	         res[i] = "*" + picture[index]+"*"; 
	         index++;  
	        }
	    }
	    return res;
	}
	
	public static String asterisksGenertator(int n)
	{
	    String res ="";
	    for(int i = 0; i<n; i++)
	    {
	        res+="*";
	    }
	    return res;
	}

}
