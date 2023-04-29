/*
TITLE:
Tribonacci Sequence

DESCRIPTION:
As the name may already reveal, it works basically like a Fibonacci, but summing
the last 3 (instead of 2) numbers of the sequence to generate the next. And, worse
part of it, regrettably I won't get to hear non-native Italian speakers trying to
pronounce it :(
So, if we are to start our Tribonacci sequence with [1, 1, 1] as a starting input
(AKA signature), we have this sequence:   [1, 1 ,1, 3, 5, 9, 17, 31, ...]
Well, you may have guessed it by now, but to be clear: you need to create a
fibonacci function that given a signature array/list, returns the first n
elements - signature included of the so seeded sequence.
Signature will always contain 3 numbers; n will always be a non-negative number;
if n == 0, then return an empty array (except in C return NULL) and be ready for
anything else which is not clearly specified ;)
*/


public class TribonacciSequence {
   public static double[] tribonacci(double[] s, int n) {
      double[] result = new double[n];
      for (int i = 0; i < n && i < s.length; i++) {
         result[i] = s[i];
      }
      for (int i = 3; i < n; i++) {
         result[i] = result[i - 1] + result[i - 2] + result[i - 3];
      }
      return result;
   }

}
