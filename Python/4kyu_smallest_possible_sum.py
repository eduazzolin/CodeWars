'''
TITLE:
Smallest possible sum

DESCRIPTION:
Given an array X of positive integers, its elements are to be transformed by running the
following operation on them as many times as required:

if X[i] > X[j] then X[i] = X[i] - X[j]

When no more transformations are possible, return its sum ("smallest possible sum").
For instance, the successive transformation of the elements of input X = [6, 9, 21] is
detailed below:
X_1 = [6, 9, 12] # -> X_1[2] = X[2] - X[1] = 21 - 9
X_2 = [6, 9, 6]  # -> X_2[2] = X_1[2] - X_1[0] = 12 - 6
X_3 = [6, 3, 6]  # -> X_3[1] = X_2[1] - X_2[0] = 9 - 6
X_4 = [6, 3, 3]  # -> X_4[2] = X_3[2] - X_3[1] = 6 - 3
X_5 = [3, 3, 3]  # -> X_5[1] = X_4[0] - X_4[1] = 6 - 3
The returning output is the sum of the final transformation (here 9).

Example
solution([6, 9, 21]) #-> 9

Solution steps:
[6, 9, 12] #-> X[2] = 21 - 9
[6, 9, 6] #-> X[2] = 12 - 6
[6, 3, 6] #-> X[1] = 9 - 6
[6, 3, 3] #-> X[2] = 6 - 3
[3, 3, 3] #-> X[1] = 6 - 3

Additional notes:
There are performance tests consisted of very big numbers and arrays of size at least
30000. Please write an efficient algorithm to prevent timeout.

KYU & CREDITS:
4 kyu dkhaburdzania
https://www.codewars.com/kata/52f677797c461daaf7000740
'''


def solution(a: list):
    set_a = set(a)

    while len(set_a) > 1:
        current_list = sorted(list(set_a), reverse=True)
        for i in range(len(current_list) - 1):
            while current_list[i] > current_list[i + 1]:
                current_list[i] = current_list[i] - current_list[i + 1]
        set_a = set(current_list)
        if 1 in set_a: return 1 * len(a)

    return list(set_a)[0] * len(a)
