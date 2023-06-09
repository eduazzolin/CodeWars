'''
TITLE:
Create Phone Number

DESCRIPTION:
Write a function that accepts an array of 10 integers (between 0 and 9), that
returns a string of those numbers in the form of a phone number.

Example              0  1  2  3  4  5  6  7  8  9
create_phone_number([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]) # => returns "(123) 456-7890"
The returned format must be correct in order to complete this challenge.

Don't forget the space after the closing parentheses!

KYU & CREDITS:
6 kyu @xDranik
https://www.codewars.com/kata/525f50e3b73515a6db000b83
'''


def create_phone_number(n):
    number = ''.join(str(b) for b in n)
    return f"({number[0:3]}) {number[3:6]}-{number[6:]}"
