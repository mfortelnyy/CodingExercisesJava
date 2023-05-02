
public class variableName {
	public static void main(String[] args) {
		String name = "_odsifidsn4564654_dsf1"; //true
		String nameFalse = "4U4";
		System.out.println(f(nameFalse));
	}

	public static boolean f(String name)
	{
		//pretty simple regex varibale name can start and continue(+) with either upper or lower case letter or undercore and preceeding part can be any word(letter+numbers) or undersocre
		return name.matches("[a-zA-Z_]+[\\w_]*");
	}
}
		
		
		
		
		

//Failed attempt but possible to solve this way as well just easier to use regex
		/*
		String[] num = new String[12];
		char[] special = new char[4];
		special[0] = ' ';
	    special[1] = '-';
	    special[2] = '.';
	    special[3] = ',';
	    
	    for(int i=0; i< num.length;
	    	    i++)
	    	    {
	    	        num[i] = String.valueOf(i);
	    	    }
	    
		if(founds(num, String.valueOf(name.charAt(0))))
	        return false;
	    
	    char[] varchar = name.toCharArray();
	    for(int i=1; i< varchar.length; i++)
	    {
	        if(foundc(special,varchar[i]) || varchar[i]<65 || varchar[i]>90 || varchar[i]<97 || varchar[i]>122 || varchar[i] != 95 )
	            return false;
	    }    
	    return true;
	}

	public static boolean founds(String[] arr, String element)
	{
	    boolean found = false;
	    for(String i : arr)
	        if(element.equals(i))
	            found = true;
	    
	    return found;
	}

	public static boolean foundc(char[] arr, char el)
	{
	    boolean found = false;
	    for(char i : arr)
	        if(el == i)
	            found = true;
	    
	    return found;
	}	
}
*/