'''
TITLE:
Sum without highest and lowest number

DESCRIPTION:
Sum all the numbers of a given list, except the highest and the lowest element (by value, not by index!).
The highest or lowest element respectively is a single element at each edge,
even if there are more than one with the same value.
Mind the input validation.
Example
{ 6, 2, 1, 8, 10 } => 16
{ 1, 1, 11, 2, 3 } => 6

KYU & CREDITS:
8 kyu @user5036852
https://www.codewars.com/kata/576b93db1129fcf2200001e6
'''


def sum_array(arr):
    if arr is None or len(arr) == 0:
        return 0
    if len(arr) == 1:
        return 0

    # the largest but O(n) way:
    max_value = arr[0]
    min_value = arr[0]
    sum_value = 0

    for n in arr:
        if n > max_value:
            max_value = n
        if n < min_value:
            min_value = n
        sum_value += n

    return sum_value - max_value - min_value

    # the easyiest way:
    # return sum(arr) - max(arr) - min(arr)
