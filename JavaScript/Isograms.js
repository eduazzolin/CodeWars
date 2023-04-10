/*
TITLE:
Isograms

DESCRIPTION:
An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

Example: (Input --> Output)
"Dermatoglyphics" --> true
"aba" --> false
"moOse" --> false (ignore letter case)
*/

function isIsogram(str) {

    // converting to lower case to ignore case:
    str = str.toLowerCase();

    // putting the string into a set, because sets don't allow duplicated elements:
    let set = new Set(str.split(''));

    // returning false if any character was lost for being duplicated 
    // returning true if both the set and the string have the same amount of characters
    return (set.size === str.length);

}