"""
randomly generating different permutations of an array
and then checking whether it is sorted or not
"""
import random
import sys

from load import load_numbers

numbers = load_numbers(sys.argv[1])


def is_sorted(values):
    for index in range(len(values) - 1):
        if values[index] > values[index + 1]:
            return False
    return True


def bogo_sort(values):
    attempts = 0
    while not is_sorted(values):
        random.shuffle(values)
        attempts += 1
    print("attempts :", attempts)
    return values


print(bogo_sort(numbers))
