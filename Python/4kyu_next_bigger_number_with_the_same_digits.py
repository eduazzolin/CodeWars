'''
TITLE:
Next bigger number with the same digits

DESCRIPTION:
Create a function that takes a positive integer and returns the next bigger
number that can be formed by rearranging its digits. For example:

  12 ==> 21
 513 ==> 531
2017 ==> 2071
If the digits can't be rearranged to form a bigger number, return -1 (or nil in Swift, None in Rust):

  9 ==> -1
111 ==> -1
531 ==> -1

KYU & CREDITS:
4 kyu @GiacomoSorbi
https://www.codewars.com/kata/55983863da40caa2c900004e/python
'''


def next_bigger(n):
    n_list = [c for c in str(n)]

    # checking if it isn't already at it's max
    if sorted(n_list, reverse=True) == n_list:
        return -1

    # it iterates from right to left searching for the first pair in which the right number ir bigger than the left one
    # then the left one is swapped with the first number bigger than him from right to left
    # and all the numbers after that are then sorted in ascending order
    for i in range(len(n_list) - 1, -1, -1):
        j = i - 1
        if n_list[i] > n_list[j]:
            for k in range(len(n_list) - 1, j, -1):
                if n_list[k] > n_list[j]:
                    n_list[j], n_list[k] = n_list[k], n_list[j]
                    n_list = n_list[:i] + sorted(n_list[i:])
                    return int(''.join([n for n in n_list]))
