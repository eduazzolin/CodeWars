/*
TITLE:
Roman Numerals Encoder

DESCRIPTION:
Create a function taking a positive integer between 1 and 3999 (both included) as its parameter and returning a string containing the Roman Numeral representation of that integer.
Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.

Example:
conversion.solution(1000); //should return "M"
Symbol    Value
I          1
V          5
X          10
L          50
C          100
D          500
M          1,000
Remember that there can't be more than 3 identical symbols in a row.

KYU & CREDITS:
6 kyu @jhoffner
https://www.codewars.com/kata/51b62bf6a9c58071c600001b
*/

public class RomanNumeralsEncoder {

	 public String solution(int n) {
		// an array to store in sequence the letters that are going to be used:
		String[] roman = {"I", "V", "X", "L", "C", "D", "M"};
		String nStr  = Integer.toString(n);
		String result = "";
		int i = 0;
			
		// a loop that goes through each character of the number
		for (int j = nStr.length(); j > 0; j--) {
			// a switch that applies the logic behind roman numbers using a counter that sums 2 after each iteraction 
			switch (nStr.substring(j-1,j)) {
				case "1": {result = roman[i] + result;	break;}
				case "2": {result = roman[i] + roman[i] + result;	break;}
				case "3": {result = roman[i] + roman[i] + roman[i] + result;	break;}
				case "4": {result = roman[i] + roman[i+1] + result;	break;}
				case "5": {result = roman[i+1] + result;	break;}
				case "6": {result = roman[i+1] + roman[i] + result;	break;}
				case "7": {result = roman[i+1] + roman[i] + roman[i] + result;	break;}
				case "8": {result = roman[i+1] + roman[i] + roman[i] + roman[i] + result;	break;}
				case "9": {result = roman[i] + roman[i+2] + result;	break;}
			}
			i = i+2;
		}
		
		return result;
	 }
	
	
}
