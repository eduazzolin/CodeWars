'''
TITLE:
Descending Order

DESCRIPTION:
Your task is to make a function that can take any non-negative integer as an argument
and return it with its digits in descending order. Essentially, rearrange the digits
to create the highest possible number.

Examples:
Input: 42145 Output: 54421
Input: 145263 Output: 654321

KYU & CREDITS:
7 kyu @TastyOs
https://www.codewars.com/kata/5467e4d82edf8bbf40000155
'''


def descending_order(num):
    # this function turns the number into a list of ints
    # puts the list in descending order
    # joins the list into a single string and casts it to int
    number_list = list(map(int, str(num)))
    number_list.sort(reverse=True)
    return int(''.join(map(str, number_list)))