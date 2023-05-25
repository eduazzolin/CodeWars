/*
TITLE:
parseInt() reloaded

DESCRIPTION:
In this kata we want to convert a string into an integer. The strings simply represent
the numbers in words.

Examples:

"one" => 1
"twenty" => 20
"two hundred forty-six" => 246
"seven hundred eighty-three thousand nine hundred and nineteen" => 783919

Additional Notes:

The minimum number is "zero" (inclusively)
The maximum number, which must be supported is 1 million (inclusively)
The "and" in e.g. "one hundred and twenty-four" is optional, in some cases it's present
and in others it's not
All tested numbers are valid, you don't need to validate them

KYU & CREDITS:
4 kyu BattleRattle
https://www.codewars.com/kata/525c7c5ab6aecef16e0001a5
*/

import java.util.HashMap;

public class parseIntReloaded {

   public static int parseInt(String numStr) {

      // setting up the maps:
      HashMap<String, Integer> mult = new HashMap<>();
      mult.put("hundred", 100);
      mult.put("thousand", 1000);
      mult.put("million", 1000000);

      HashMap<String, Integer> add = new HashMap<>();
      String[] keysAdd = {
              "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
              "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
              "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
      Integer[] valuesAdd = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 30, 40, 50, 60, 70, 80, 90};
      for (int i = 0; i < keysAdd.length; i++) add.put(keysAdd[i], valuesAdd[i]);


      // separating the words of the argument:
      String[] words = numStr.replace("-", " ").split(" ");


      // identifying and turning the words into numbers:
      int answer = 0;
      int aux = 0;
      for (String word : words) {
         if (mult.containsKey(word)) {
            if (mult.get(word) > answer) {
               answer = (aux + answer) * mult.get(word);
            } else {
               answer += aux * mult.get(word);
            }
            aux = 0;
         }
         if ((add.containsKey(word))) {
            aux += add.get(word);
         }
      }

      answer += aux;
      return answer;
   }

}
