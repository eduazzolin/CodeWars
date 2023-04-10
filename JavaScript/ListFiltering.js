/*
TITLE:
List Filtering

DESCRIPTION:
In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
*/

function filter_list(l) {

    // creating a new array to store the numbers:
    const result = [];

    // looping the array from the parameter 
    for (let i = 0; i < l.length; i++) {
        // if the type of the element is 'number' than push it to the new array:
        if (typeof l[i] === 'number') result.push(l[i]);
    }

    return result;
}