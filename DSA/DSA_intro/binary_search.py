# REQUIREMENT - search_list has to be sorted

"""
Time complexity -  O(log n) - in while loop size of search list changes until it is a single element
Space complexity - O(1)  - no additional storage for algorithm functionality when size of search_list grows
"""

def binary_search(search_list, target):
    first = 0 #TC - O(1)
    last = len(search_list)-1 #TC - O(1)
    while first<=last:
        midpoint = (first+last)//2 #TC - O(1)
        if search_list[midpoint] == target: #TC - O(1)
            return midpoint
        elif search_list[midpoint]<target: #TC - O(1)
            first=midpoint+1 #TC - O(1)
        else:
            last=midpoint-1 #TC - O(1)
    return None

def verify(i):
    if i is not None:
        print("Target found at index :", i)
    else:
        print("Target not found in list")

numbers = [x for x in range(1,11)]
result = binary_search(numbers,12)
verify(result)

result = binary_search(numbers,6)
verify(result)