/*
TITLE:
Replace With Alphabet Position

DESCRIPTION:
In this kata you are required to, given a string, replace every letter with its position in the alphabet.
If anything in the text isn't a letter, ignore it and don't return it.
"a" = 1, "b" = 2, etc.

KYU & CREDITS:
6 kyu @MysteriousMagenta
https://www.codewars.com/kata/546f922b54af40e1e90001da
*/

function alphabetPosition(text) {

    // string to hold the result:
    let result = '';

    // loop to traverse the string:
    for (let i = 0; i < text.length; i++) {

        // converting to lowercase so that both "a" and "A" have the same char code:
        text = text.toLowerCase();

        // getting the (char code - 96) of each character to make it match the alphabet order:
        let charCode = text.charCodeAt(i) - 96;

        // ignoring anything that is out of the alphabet char code scope:
        if (charCode < 1 || charCode > 26) {
            continue;
        }

        // adding the code to the result string plus a black space:
        result += charCode + " ";
    }

    // returning the result string without the empty space at the end:
    return result.trimEnd();
}