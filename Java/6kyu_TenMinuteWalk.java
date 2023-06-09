/*
TITLE:
Take a Ten Minutes Walk

DESCRIPTION:
You live in the city of Cartesia where all roads are laid out in a perfect grid. You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk. The city provides its citizens with a Walk Generating App on their phones -- everytime you press the button it sends you an array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only a single block for each letter (direction) and you know it takes you one minute to traverse one city block, so create a function that will return true if the walk the app gives you will take you exactly ten minutes (you don't want to be early or late!) and will, of course, return you to your starting point. Return false otherwise.

Note: you will always receive a valid array containing a random assortment of direction letters ('n', 's', 'e', or 'w' only). It will never give you an empty array (that's not a walk, that's standing still!).

KYU & CREDITS:
6 kyu @JKphobic
https://www.codewars.com/kata/54da539698b8a2ad76000228
*/

public class TenMinuteWalk {
	public static boolean isValid(char[] walk) {

		// checking if it's a ten minute walk:
		if (walk.length != 10) {
			return false;
		}

		// vertical and horizontal variables:
		int v = 0;
		int h = 0;

		// loop to calculate the directions:
		for (int i = 0; i < walk.length; i++) {
			switch (walk[i]) {
				case 'n': {v++; break;}
				case 's': {v--; break;}
				case 'e': {h++; break;}
				case 'w': {h--; break;}
			}
		}

		// checking if it returns to the starting point:
		return (v == 0 && h == 0);
	}
}
