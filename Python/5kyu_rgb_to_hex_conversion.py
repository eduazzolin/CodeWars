'''
TITLE:
RGB To Hex Conversion

DESCRIPTION:
The rgb function is incomplete. Complete it so that passing in RGB decimal
values will result in a hexadecimal representation being returned. Valid decimal
values for RGB are 0 - 255. Any values that fall out of that range must be rounded
to the closest valid value.

Note: Your answer should always be 6 characters long, the shorthand with 3 will
not work here.

The following are examples of expected output values:

rgb(255, 255, 255) # returns FFFFFF
rgb(255, 255, 300) # returns FFFFFF
rgb(0,0,0) # returns 000000
rgb(148, 0, 211) # returns 9400D3

KYU & CREDITS:
5 kyu @jhoffner
https://www.codewars.com/kata/513e08acc600c94f01000001/python
'''


def rgb(r, g, b):
    # checking the input:
    if r > 255: r = 255
    if g > 255: g = 255
    if b > 255: b = 255
    if r < 0: r = 0
    if g < 0: g = 0
    if b < 0: b = 0

    # argument : fill(0) orientation(right) number-of-characters(2) type(hex)
    return f'{r:0>2X}{g:0>2X}{b:0>2X}'

# After completing this challenge, I learned the following technique
# to limit the value of a number:
#    clamp = lambda x: max(0, min(x, 255))
