/*
TITLE:
Mean Square Error

DESCRIPTION:
Complete the function that

accepts two integer arrays of equal length
compares the value each member in one array to the corresponding member in the other
squares the absolute value difference between those two values
and returns the average of those squared absolute value difference between each member
pair.
Examples
[1, 2, 3], [4, 5, 6]              -->   9   because (9 + 9 + 9) / 3
[10, 20, 10, 2], [10, 25, 5, -2]  -->  16.5 because (0 + 25 + 25 + 16) / 4
[-1, 0], [0, -1]                  -->   1   because (1 + 1) / 2

KYU & CREDITS:
5 kyu kylehill
https://www.codewars.com/kata/51edd51599a189fe7f000015
*/

public class MeanSquareError {
   public static double solution(int[] arr1, int[] arr2) {
      double s = 0;
      for (int i = 0; i < arr1.length; i++) {
         // add to s the square (Math.pow(,2))
         // of the absolute value of arr1[i] - arr2[i] (Math.abs())
         s += Math.pow(Math.abs(arr1[i] - arr2[i]), 2);
      }
      return s / arr1.length;
   }
}


