
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
