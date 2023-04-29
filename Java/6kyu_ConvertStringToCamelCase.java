/*
TITLE:
Convert string to camel case

DESCRIPTION:
Complete the method/function so that it converts dash/underscore delimited
words into camel casing. The first word within the output should be
capitalized only if the original word was capitalized (known as Upper Camel
Case, also often referred to as Pascal case). The next words should be
always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"
"The_Stealth_Warrior" gets converted to "TheStealthWarrior"
"The_Stealth-Warrior" gets converted to "TheStealthWarrior"

KYU & CREDITS:
6 kyu @jhoffner
https://www.codewars.com/kata/517abf86da9663f1d2000003
*/

public class ConvertStringToCamelCase {

   public static String camelCase(String s) {

      // splits the string by '-' ou '_' and then for each word in the array,
      // except the first one, do the upper case method to the first letter.
      String[] strArray = s.replace('_', '-').split("-");
      String result = strArray[0];
      if (strArray.length > 1) {
         for (int i = 1; i < strArray.length; i++) {
            result += strArray[i].substring(0, 1).toUpperCase() + strArray[i].substring(1);
         }
      }
      return result;
   }
}
