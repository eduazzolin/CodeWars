'''
TITLE:
Strip Comments

DESCRIPTION:
Complete the solution so that it strips all text that follows any of
a set of comment markers passed in. Any whitespace at the end of the
line should also be stripped out.

Example:
Given an input string of:

apples, pears # and bananas
grapes
bananas !apples
The output expected would be:

apples, pears
grapes
bananas
The code would be called like so:

result = solution("apples, pears # and bananas\ngrapes\nbananas !apples", ["#", "!"])
# result should == "apples, pears\ngrapes\nbananas"

KYU & CREDITS:
4 kyu @jhoffner
https://www.codewars.com/kata/51c8e37cee245da6b40000bd/python
'''

def strip_comments(strng, markers):

    lines = strng.splitlines()

    for i in range(len(lines)):
        for marker in markers:
            end_index = lines[i].find(marker)
            if end_index >= 0:
                lines[i] = lines[i][:end_index]
        lines[i] = lines[i].rstrip()

    return '\n'.join(lines)

