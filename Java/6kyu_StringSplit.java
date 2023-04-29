/*
TITLE:
Split Strings

DESCRIPTION:
Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').

Examples:
* 'abc' =>  ['ab', 'c_']
* 'abcdef' => ['ab', 'cd', 'ef']

KYU & CREDITS:
6 kyu @jhoffner
https://www.codewars.com/kata/515de9ae9dcfc28eb6000001
*/
public class StringSplit {
	public static String[] solution(String s) {

		// if the string is odd, then add the last character:
		if (s.length() % 2 != 0) {
			s += "_";
		}

		// Resulting array and an extra counter
		String[] result = new String[s.length() / 2];
		int j = 0;

		// adding substrings of 's' to the new array
		for (int i = 0; i < result.length; i++) {
			result[i] = s.substring(j, (j + 2));
			j = j + 2;
		}

		return result;
	}
}
