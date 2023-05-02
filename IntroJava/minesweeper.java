
public class minesweeper {
	/*
	 * In the popular Minesweeper game you have a board with some mines and those cells 
	 * that don't contain a mine have a number in it that indicates the total number 
	 * of mines in the neighboring cells. Starting off with some arrangement of mines 
	 * we want to create a Minesweeper game setup.

Example

For

matrix = [[true, false, false],
          [false, true, false],
          [false, false, false]]
the output should be

solution(matrix) = [[1, 2, 1],
                    [2, 1, 1],
                    [1, 1, 1]]
	 */
	public static void main(String[] args) {
	boolean[][] m = 
	{{true, false, false}, 
	 {false,true,false}, 
	 {false,false,false}};
	int rows  = m.length;
	int cols = m[0].length;
	int res[][] = new int[rows][cols];
	
	boolean[][] ext_matrix = new boolean[rows+2][cols+2];
    for(int i=0; i<ext_matrix.length; i++ )
    {
        for(int j=0; j< ext_matrix[i].length; j++)
        {
            if(i==0 || i==ext_matrix.length-1 || j==0 || j == ext_matrix[i].length-1)
            {
                ext_matrix[i][j] = false;
            }
            else
            {
             ext_matrix[i][j] = m[i-1][j-1];   
            }
        }
    }
    for(int r =1; r<ext_matrix.length-1; r++)
    {
        for(int c =1; c<ext_matrix[r].length-1; c++)
        {
            res[r-1][c-1] = countMines(ext_matrix, r, c);            
        }
    }
    


    
   for(int[] i : res)
   {
	   printRow(i);
   }
    
  }
	
	public static void printRow(int[] row) {
        for ( int i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }
	
	public static int countMines(boolean[][] a, int r, int c)
	{
		System.out.println(r + "   "+c);
	    int count =0;
	    if(a[r-1][c]==true)
	            count++;
	    if(a[r+1][c]==true)
	            count++;
	    if(a[r][c-1]==true)
	            count++;
	    if(a[r][c+1]==true)
	            count++;
	    if(a[r-1][c-1]==true)
	            count++;
	    if(a[r-1][c+1]==true)
	            count++;
	    if(a[r+1][c-1]==true)
	            count++;
	    if(a[r+1][c+1]==true)
	            count++;
	        
	    return count;
	}
}
