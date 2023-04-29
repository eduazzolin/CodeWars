/*
TITLE:
Multiples of 3 or 5

DESCRIPTION:
If we list all the natural numbers below a given number that are multiples of 3 or 5, we get the sum of these multiples.
If the given number is negative, return 0 (for languages that do have them).
Note: If the number is a multiple of both 3 and 5, only count it once.

KYU & CREDITS:
6 kyu @jhoffner
https://www.codewars.com/kata/514b92a657cdc65150000006
*/

public class Multiples3or5 {
	public int solution(int number) {

		// checking if the number is 0 or negative:
		if (number <= 0) {
			return 0;
		}

		// creating a variable to store the sum:
		int sum = 0;

		// traversing every number below the argument:
		for (int i = 1; i < number; i++) {

			// if the number is divisible by 3 or 5 than add it to the sum variable:
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}

		// returning the sum:
		return sum;
	}
}
