/*
TITLE:
Next smaller number with the same digits

DESCRIPTION:
Write a function that takes a positive integer and returns the next smaller positive
integer containing the same digits.

For example:

nextSmaller(21) == 12
nextSmaller(531) == 513
nextSmaller(2071) == 2017

Return -1 (for Haskell: return Nothing, for Rust: return None), when there is no smaller
number that contains the same digits. Also return -1 when the next smaller number with
the same digits would require the leading digit to be zero.

nextSmaller(9) == -1
nextSmaller(111) == -1
nextSmaller(135) == -1
nextSmaller(1027) == -1 // 0721 is out since we don't write numbers with leading zeros
some tests will include very large numbers.
test data only employs positive integers.

The function you write for this challenge is the inverse of this kata: "Next bigger
number with the same digits."

KYU & CREDITS:
4 kyu LesRamer
https://www.codewars.com/kata/5659c6d896bc135c4c00021e
*/

import java.util.Arrays;
import java.util.stream.IntStream;

public class NextSmallerNumberWithTheSameDigits {


   public static long nextSmaller(long n) {
      // converting it into a list:
      int[] nList = String.valueOf(n)
              .chars().map(Character::getNumericValue)
              .toArray();

      if (nList.length == 1) {
         return -1;
      }

      // it iterates from right to left searching for the first pair in which the right number ir smaller than the left one
      // then the left one is swapped with the first number smaller than him from right to left
      // and all the numbers after that are then sorted in descending order
      for (int i = nList.length - 1; i > 0; i--) {
         int j = i - 1;
         if (nList[i] < nList[j]) {
            for (int k = nList.length - 1; k > j; k--) {
               if (nList[k] < nList[j]) {
                  nList = swapAndSortTheRest(nList, i, j, k);

                  if (nList[0] == 0) {
                     // if the next smaller number "starts" with zero
                     return -1;
                  }

                  // turning the array back into a long:
                  String nString = "";
                  for (int number : nList) {
                     nString += number;
                  }
                  return Long.parseLong(nString);
               }
            }
         }
      }
      return -1;
   }

   private static int[] swapAndSortTheRest(int[] l, int i, int j, int k) {
      // swapping:
      int aux = l[k];
      l[k] = l[j];
      l[j] = aux;

      // separating:
      int[] beggining = Arrays.copyOf(l, i);
      int[] end = Arrays.copyOfRange(l, i, l.length);

      // sorting in desc order:
      Arrays.sort(end);
      int[] endSorted = new int[end.length];
      for (int x = 0; x < endSorted.length; x++) {
         endSorted[x] = end[end.length - x - 1];
      }

      // merging:
      return IntStream.concat(Arrays.stream(beggining), Arrays.stream(endSorted)).toArray();
   }
}
