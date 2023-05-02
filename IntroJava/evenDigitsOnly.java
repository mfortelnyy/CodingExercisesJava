
public class evenDigitsOnly {
	/*
	 * Check if all digits of the given integer are even.

Example

For n = 248622, the output should be
solution(n) = true;
For n = 642386, the output should be
solution(n) = false.
	 */

	public static void main(String[] args) {

		int a = 248622;
		int b = 642386;
		System.out.println(evenOnly(b));
	}
	
	
	public static boolean evenOnly(int n) {
		String num = String.valueOf(n);
		for (int i = 0; i < num.length(); i++) {
			if(Integer.valueOf(num.charAt(i)) % 2 != 0)
					return false;		
		}
		return true;
	}

}
