def merge_sort(input_list):
    """
    Sorts a list in ascending order.
    :return: a new sorted list

    Divide : Find the midpoint of the list and divide into sub lists
    Conquer : Recursively sort the sub lists created in previous step
    Combine : Merge the sorted sub lists created in previous step

    Takes O(kn log n) time - n no of merges x log n splits of original list >
    with a different slice implementation takes O(n log n) time

    Space complexity - O(n)
    """
    if len(input_list) <= 1:
        return input_list

    left_half, right_half = split(input_list)
    left = merge_sort(left_half)
    right = merge_sort(right_half)

    return merge(left, right)


def split(sort_list):
    """
    Divide the unsorted list at midpoint into sub lists
    :return: two sub lists - left and right

    Takes overall O(k log n) time
    """
    mid = len(sort_list) // 2
    left = sort_list[:mid]  # O(k) - k is slice size
    right = sort_list[mid:]  # includes mid point

    return left, right


def merge(left, right):
    """
    Merges two lists(arrays) , sorting them in process
    :return: new merged list

    Runs in overall O(n)
    """
    sorted_list = []
    i = 0
    j = 0

    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            sorted_list.append(left[i])
            i += 1
        else:
            sorted_list.append(right[j])
            j += 1

    # when right list is shorter than left list
    while i < len(left):
        sorted_list.append(left[i])  # the remaining items in left are sorted
        i += 1

    # when left list is shorter than right list
    while j < len(right):
        sorted_list.append(right[j])
        j += 1

    return sorted_list


def verify_sorted(input_list):
    n = len(input_list)

    if n == 0 or n == 1:
        return True

    return input_list[0] < input_list[1] and verify_sorted(input_list[1:])


alist = [54, 26, 93, 17, 77, 31, 44, 55, 20]
l = merge_sort(alist)
print(verify_sorted(alist))
print(verify_sorted(l))
