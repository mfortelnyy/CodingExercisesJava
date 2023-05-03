
public class chessBoardCellColor {
	/*
	 * Given two cells on the standard chess board, determine whether they have the same color or not.

Example

For cell1 = "A1" and cell2 = "C3", the output should be
solution(cell1, cell2) = true



For cell1 = "A1" and cell2 = "H3", the output should be
solution(cell1, cell2) = false.
	 */

	public static void main(String[] args) {
		System.out.println(chessCellColor("A1", "C3"));
		 	
	}
	
	public static boolean chessCellColor(String cell1, String cell2)
	{
		int[][] board = new int[8][8];
	    //char[] letters = {'A','B','C','D','E','F','G','H'};
	    int cel1row = cell1.charAt(0) - 65; //Ascii of 'A' = 65 -> need index of an array starting from 0
	    int cel1col = Integer.parseInt( String.valueOf( cell1.charAt(1) ) )-1;//or ascii of character 1 is 49
	    
	    int cel2row = cell2.charAt(0) - 65; 
	    int cel2col = cell2.charAt(1) - 49; 
	    
	    //basically fill in the matrix with 0 and 1 representing different shades 
	    //and then just compare if the numbers are equal at the requested indicies
	    for(int i = 0; i< board.length; i++)
			    {
			        for(int j =0; j<board[i].length; j++)
			        {
			        	if(i%2==0)
			        	{
			        		if(j%2==0)
			        		{
			        			board[i][j] = 0;
			        		}
			        		else
			        			board[i][j] = 1;
			        	}
			        	else
			        	{
			        		if(j%2==0)
			        		{
			        			board[i][j] = 1;
			        		}
			        		else
			        			board[i][j] = 0;
			        	}
			        }
			    }
	            
	            //System.out.println("cell1row:  "+cel1row  + "  cell1col:  "+ cel1col);
	            //System.out.println("cell2row:  "+cel2row  + "  cell2col:  "+ cel2col);
	            if(board[cel1row][cel1col] == board[cel2row][cel2col]) 
	            {
	                return true; 
	            }
	            else
	                return false;

	}
	
	public static void printRow(int[] row) {
        for ( int i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }
	
}
