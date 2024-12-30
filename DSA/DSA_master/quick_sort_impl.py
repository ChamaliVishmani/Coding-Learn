def quick_sort(array):

    if len(array) <= 1:
        return array,0

    l = len(array)
    pivot=array[l - 1]
    print("pivot :",pivot)

    last_skipped_j=-1
    for i in range(l):
        if array[i]<pivot:
            last_skipped_j+=1
            array[i], array[last_skipped_j] = array[last_skipped_j], array[i]

    array[last_skipped_j+1] ,array[l-1]=array[l-1], array[last_skipped_j+1]

    return array,last_skipped_j+1

def quick_sort_helper(arr_to_sort, pivot_index):

    sub_arr_l = arr_to_sort[:pivot_index]
    if len(sub_arr_l) >1:
        sub_arr_l,new_pivot_index = quick_sort(sub_arr_l)
        sub_arr_l  = quick_sort_helper(sub_arr_l, new_pivot_index)

    sub_arr_r = arr_to_sort[pivot_index + 1:]
    if len(sub_arr_r) >1:
        sub_arr_r,new_pivot_index  = quick_sort(sub_arr_r)
        sub_arr_r=quick_sort_helper(sub_arr_r, new_pivot_index )

    arr_to_sort= sub_arr_l + [arr_to_sort[pivot_index]] + sub_arr_r
    return arr_to_sort

def quick_sort_test():
    arr = [10, 80, 30, 90, 40, 20]
    arr, last_swapped_j = quick_sort(arr)

    sorted_arr = quick_sort_helper(arr, last_swapped_j)
    print("sorted_arr : ", sorted_arr)


quick_sort_test()

