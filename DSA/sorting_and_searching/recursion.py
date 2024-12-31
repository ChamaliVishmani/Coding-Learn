def sum_iteration(numbers):
    total = 0
    for number in numbers:
        total += number
    return total


def sum_recursion(numbers: []):
    if not numbers:
        return 0
    return numbers[0] + sum_recursion(numbers[1:])


nums = [1, 2, 7, 9]
print(sum_iteration(nums))
print(sum_recursion(nums))
