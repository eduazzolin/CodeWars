'''
Duplicate Encoder

DESCRIPTION:
The goal of this exercise is to convert a string to a new string where each character in the
new string is "(" if that character appears only once in the original string, or ")" if that
character appears more than once in the original string. Ignore capitalization when determining
if a character is a duplicate.

Examples
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))((" 

Notes
Assertion messages may be unclear about what they display in some languages. If you read 
"...It Should encode XXX", the "XXX" is the expected result, not the input!

KYU & CREDITS:
6 kyu @obnounces
https://www.codewars.com/kata/54b42f9314d9229fd6000d9c
'''


def duplicate_encode(word):
    word = word.lower()
    letter_count = len(word)
    result_list = ['']*letter_count

    for i in range(letter_count):
        if result_list[i] == ')':
            continue
        duplicate = False
        for j in range(i+1, letter_count):
            if result_list[i] == ')':
                continue
            if word[i] == word[j]:
                result_list[j] = ')'
                duplicate = True
        if duplicate:
            result_list[i] = ')'
        else:
            result_list[i] = '('

    return ''.join(result_list)
