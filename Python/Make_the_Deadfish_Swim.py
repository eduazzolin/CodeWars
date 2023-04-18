'''
TITLE:
Make the Deadfish Swim

DESCRIPTION:
Write a simple parser that will parse and run Deadfish.
Deadfish has 4 commands, each 1 character long:
i increments the value (initially 0)
d decrements the value
s squares the value
o outputs the value into the return array
Invalid characters should be ignored.
parse("iiisdoso")  ==>  [8, 64]
'''


def parse(data: str):
    result = []
    value = 0
    for letter in data:
        match letter:
            case 'i':
                value += 1
            case 'd':
                value -= 1
            case 's':
                value = value ** 2
            case 'o':
                result.append(value)
    return result
