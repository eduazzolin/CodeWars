'''
TITLE:
Beginner Series #2 Clock

DESCRIPTION:
Clock shows h hours, m minutes and s seconds after midnight.
Your task is to write a function which returns the time since midnight
in milliseconds.

KYU & CREDITS:
8 kyu @Vortus
https://www.codewars.com/kata/55f9bca8ecaa9eac7100004a
'''


def past(h, m, s):
    return (s * 1000) + (m * 60000) + (h * 3600000)
