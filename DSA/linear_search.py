def linear_search(search_list, target):
    # len(search_list), search_list[i] - a constant time operation
    for i in range(len(search_list)):
        if search_list[i] == target:
            return i
    return None

def verify(i):
    if i is not None:
        print("Target found at index :", i)
    else:
        print("Target not found in list")

numbers = [x for x in range(1,11)]
result = linear_search(numbers,6)
verify(result)