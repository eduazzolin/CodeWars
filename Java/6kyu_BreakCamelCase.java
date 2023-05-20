/*
TITLE:
Break camelCase

DESCRIPTION:
Complete the solution so that the function will break up camel casing, using a space
between words.

Example
"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  ""

KYU & CREDITS:
6 kyu hakt
https://www.codewars.com/kata/5208f99aee097e6552000148
*/

public class BreakCamelCase {

   public static String camelCase(String input) {
      String result = "";
      for (int i = 0; i < input.length(); i++) {
         if ((int) input.charAt(i) >= 65 && (int) input.charAt(i) <= 90) {
            result += " ";
         }
         result += input.charAt(i);
      }
      return result;
   }

}
