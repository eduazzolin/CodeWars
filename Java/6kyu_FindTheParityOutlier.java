/*
TITLE:
Find The Parity Outlier

DESCRIPTION:
You are given an array (which will have a length of at least 3, but could be very large)
containing integers. The array is either entirely comprised of odd integers or entirely
comprised of even integers except for a single integer N. Write a method that takes the
array as an argument and returns this "outlier" N.

Examples
[2, 4, 0, 100, 4, 11, 2602, 36]

Should return: 11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21]

Should return: 160 (the only even number)

KYU & CREDITS:
6 kyu obnounce
https://www.codewars.com/kata/5526fc09a1bbd946250002dc/
*/

public class FindTheParityOutlier {
   static int find(int[] integers) {
      // find out the majority with the first 3 numbers:
      int evens = 0;
      int odds = 0;
      for (int i = 0; i < 3; i++) {
         if (integers[i] % 2 == 0) {evens++;}
         else {odds++;}
      }

      // find out the different number:
      for (int integer : integers) {
         boolean even = integer % 2 == 0;
         if (evens > odds && !even) {return integer;}
         if (evens < odds && even) {return integer;}
      }
      return 0;
   }

}
