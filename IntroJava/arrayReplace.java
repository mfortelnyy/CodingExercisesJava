import java.util.Arrays;

public class arrayReplace {
	/*
	 * Given an array of integers, replace all the occurrences of elemToReplace with substitutionElem.

Example

For inputArray = [1, 2, 1], elemToReplace = 1, and substitutionElem = 3, the output should be
solution(inputArray, elemToReplace, substitutionElem) = [3, 2, 3].
	 */

	public static void main(String[] args) {
		int[] inputArray= { 1,2,1};
		int elemToReplace = 1;
		int substitutionElem = 3;

		System.out.println(Arrays.toString(arrayRepl(inputArray, elemToReplace, substitutionElem)));
	}

	public static int[] arrayRepl (int[] inputArray, int elemToReplace, int substitutionElem) {
		
		for (int i = 0; i < inputArray.length; i++) {
			if(inputArray[i] == elemToReplace)
				inputArray[i] = substitutionElem;
		}
		return inputArray;
	}
	
	
}
