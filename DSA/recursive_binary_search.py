"""
Time complexity -  O(log n)
Space complexity - O(log n) - new sub lists are created with list size
"""
def recursive_binary_search(search_list,target):
    if len(search_list)==0:
        return False
    else:
        midpoint=len(search_list)//2

        if search_list[midpoint]==target:
            return True
        else:
            if search_list[midpoint]<target:
                return recursive_binary_search(search_list[midpoint+1:],target)
            else:
                return recursive_binary_search(search_list[:midpoint],target)


def verify(answer):
    print("Target found: ", answer)

numbers = [x for x in range(1,11)]
result = recursive_binary_search(numbers,12)
verify(result)

result = recursive_binary_search(numbers,6)
verify(result)