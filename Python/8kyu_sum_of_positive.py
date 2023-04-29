'''
TITLE:
Sum of positive

DESCRIPTION:
You get an array of numbers, return the sum of all of the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0.
'''


def positive_sum(arr):
    #  The structure inside the sum parameter filters the list and returns
    #  a new list with only the elements that match the condition.
    return sum([n for n in arr if n > 0])
