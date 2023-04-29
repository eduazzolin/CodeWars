'''
TITLE:
Human readable duration format

DESCRIPTION:
Your task in order to complete this Kata is to write a function which formats a
duration, given as a number of seconds, in a human-friendly way.

The function must accept a non-negative integer. If it is zero, it just returns
"now". Otherwise, the duration is expressed as a combination of years, days,
hours, minutes and seconds.

It is much easier to understand with an example:

* For seconds = 62, your function should return "1 minute and 2 seconds"
* For seconds = 3662, your function should return "1 hour, 1 minute and 2 seconds"

For the purpose of this Kata, a year is 365 days and a day is 24 hours.

KYU & CREDITS:
4 kyu @davazp
https://www.codewars.com/kata/52742f58faf5485cae000b9a
'''

def format_duration(seconds):
    if seconds == 0: return 'now'

    # defining unit names and division values:
    units = [
        ['second', 1],
        ['minute', 60],
        ['hour', 3600],
        ['day', 86400],
        ['year', 31536000]
    ]

    # creating a new list with the actual units and values for the argument:
    result_list = []
    for i in range(len(units) - 1, -1, -1):
        if seconds < units[i][1]:
            continue
        else:
            current_unit_value = int(seconds / units[i][1])
            current_unit_name = units[i][0] + 's' if current_unit_value > 1 else units[i][0]
            result_list.append(f'{current_unit_value} {current_unit_name}')
            seconds = seconds % units[i][1]

    # turning that list into a string with commas and "and"s
    result_str = ''
    for i in range(len(result_list)):
        if len(result_list) - i > 2:
            result_str += result_list[i] + ', '
        elif len(result_list) - i == 2:
            result_str += result_list[i] + ' and '
        else:
            result_str += result_list[i]

    return result_str