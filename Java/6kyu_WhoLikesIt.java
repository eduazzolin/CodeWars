/*
TITLE:
Who likes it?

DESCRIPTION:
You probably know the "like" system from Facebook and other pages. People can
"like" blog posts, pictures or other items. We want to create the text that
should be displayed next to such an item.
Implement the function which takes an array containing the names of people that
like an item. It must return the display text as shown in the examples:
[]                                -->  "no one likes this"ok
["Peter"]                         -->  "Peter likes this"ok
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"ok
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
Note: For 4 or more names, the number in "and 2 others" simply increases.

KYU & CREDITS:
6 kyu @BattleRattle
https://www.codewars.com/kata/5266876b8f4bf2da9b000362
*/

public class WhoLikesIt {
   public static String whoLikesIt(String... names) {
      switch (names.length) {
         case 0 -> {
            return "no one likes this";
         }
         case 1 -> {
            return names[0] + " likes this";
         }
         case 2 -> {
            return names[0] + " and " + names[1] + " like this";
         }
         default -> {
            String result = names[0] + ", " + names[1] + " and ";
            if (names.length < 4) {
               // if it's 3 people:
               result += names[2];
            } else {
               // if it's more than 3 people:
               result += (names.length - 2) + " others";
            }
            result += " like this";
            return result;
         }
      }
   }
}
