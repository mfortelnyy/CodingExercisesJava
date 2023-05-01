
public class isIPv4Address {
	/*
	 * An IP address is a numerical label assigned to each device 
	 * (e.g., computer, printer) participating in a computer network 
	 * that uses the Internet Protocol for communication. There are 
	 * two versions of the Internet protocol, and thus two versions of 
	 * addresses. One of them is the IPv4 address.

	Given a string, find out if it satisfies the IPv4 address naming rules.
	 */

	public static void main(String[] args) {
		String inputString = "172.16.254.1";

		System.out.println(isIPv4(inputString));
	}
	
	public static boolean isIPv4(String inputString) {
		String[] arr = inputString.split("\\.");
	    
	    for(int i=0; i<arr.length; i++)
	    {
	        if(arr[i] == "00" || (arr[i].startsWith("0") && arr[i].length()>1))
	        {
	            return false;
	        }
	    }
	    

	    try{
	    for(int i=0; i < arr.length; i++)
	    {
	        if(arr[i].equals("") || arr.length != 4)
	        {
	            return false;
	        }
	        else
	        {
	        if(!(Integer.valueOf(arr[i]) >=0 && Integer.valueOf(arr[i])<256))
	        {
	            //System.out.println(Integer.valueOf(arr[i]));
	            return false;
	        }
	        }
	    }
	return true;
	    }
	    catch( NumberFormatException e)
	    {return false;}
		
	}

}
