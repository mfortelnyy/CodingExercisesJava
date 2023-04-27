
public class sortByHeight {
	/*
	Some people are standing in a row in a park. There are trees between them which cannot be moved. 
	Your task is to rearrange the people by their heights in a non-descending order without moving the trees. 
	People can be very tall!


						Example
For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
solution(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
	 */

	public static void main(String[] args) {
		
		int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
		int[] res = sortbyHeight(a);
		for(int i : res)
			System.out.println(i);

	}
	
	
	public static int[] sortbyHeight(int[] a) {
		int s = 0; // strart
	    int l = a.length-1; //end
	    
	    while(s<=l)
	    {
	        if(a[s]==-1)
	            s++;    
	        else if(a[l]==-1)
	           l--;
            
            else
            {
                insertionSort(a, s ,l);
                s++;
                
            }
	    }
        return a;		
	}
	
	
	public static void insertionSort(int[] a, int s, int l)
    {
        for(int i= l; i>=s; i--)
        {
            if(a[i] != -1 && a[i]<a[s])
            {
                //swap
            int temp = a[s];
            a[s] = a[i];
            a[i] = temp;
            }
        }
        
    }


}
