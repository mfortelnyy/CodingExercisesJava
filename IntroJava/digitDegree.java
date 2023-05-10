
public class digitDegree {
	/*Let's define digit degree of some positive integer as the number of times 
	 * we need to replace this number with the sum of its digits until we get 
	 * to a one digit number.

Given an integer, find its digit degree.

Example

For n = 5, the output should be
solution(n) = 0;
For n = 100, the output should be
solution(n) = 1.
1 + 0 + 0 = 1.
For n = 91, the output should be
solution(n) = 2.
9 + 1 = 10 -> 1 + 0 = 1.
*/

	public static void main(String[] args) {
		System.out.println("For n = 100, the output is " +digDegree(100));
		System.out.println("For n = 91, the output is "+digDegree(91));

		
	}
	
	public static int digDegree(int n) {
		int count = 0;
		return rec(n, count);
	}

	public static int rec(int n, int count)
	{
		int sum =0;

		if(String.valueOf(n).length() == 1)
			return count;
		else 
		{
			count++;
			char[] a = String.valueOf(n).toCharArray();
			for(char i : a)
			{
				sum += Integer.valueOf(String.valueOf(i));
			}
			return rec(sum, count);
		}
	}

}
