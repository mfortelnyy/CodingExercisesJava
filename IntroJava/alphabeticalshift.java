
public class alphabeticalshift {
	/*
	 * Given a string, your task is to replace each of its characters 
	 * by the next one in the English alphabet; i.e. replace a with b, 
	 * replace b with c, etc (z would be replaced by a).

Example

For inputString = "crazy", the output should be solution(inputString) = "dsbaz".
	 */

	public static void main(String[] args) {
		
		String name = "abc";
		String name1 = "crazy";
		System.out.println(alphaShift(name1));
		
	    }
	
		
		
		public static String alphaShift(String name)
		{
			char[] a = name.toCharArray();
			
		    String res = "";
		    for(int i=0; i<a.length; i++)
		    {
		        if(a[i] >=65 &&  a[i]<=90 || a[i]>= 97 && a[i]<=122 )
		        {
		        	//System.out.println((int)a[i]);
		            if((int)a[i]==90)
		                res=res+ (char) 65;
		            else if((int)a[i]==122)
		                res=res+ (char) 97;
		            else
		            {
		            	int ascii = a[i]+1;
			        	//System.out.println(ascii);
		                res=res+(char) ascii;
		            }
		            //System.out.println("res :  "+ res);
		        }
		        
		        else
		            res=res+(char)a[i];
		    }
		    return res;
		
	}
}


