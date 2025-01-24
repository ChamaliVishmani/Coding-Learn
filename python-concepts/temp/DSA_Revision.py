def binary_search(nums,target):
    # note : need a sorted array
    start=0
    end=len(nums)-1

    while start<=end:
        mid=(start+end)//2
        if nums[mid]==target:
            return mid
        elif nums[mid]<target:
            start=mid+1
        else:
            end=mid-1
    return None

## insertion sort

def selection_sort(nums):
    sorted = []
    for i in range(len(nums)):
        min_i=find_min_val_i(nums)
        sorted.append(nums.pop(min_i))
    return sorted

def find_min_val_i(nums):
    min_i=0
    for i in range(len(nums)):
        if nums[i]<nums[min_i]:
            min_i=i
    return min_i

## quick sort

def quick_sort(nums):
    if len(nums)<2:
        return nums

    pivot = nums[0]
    less_than_pivot = []
    higher_than_pivot = []
    for i in range(1,len(nums)):
        if nums[i]<=pivot:
            less_than_pivot.append(nums[i])
        else:
            higher_than_pivot.append(nums[i])

    # print("pivot",pivot)
    # print("less_than_pivot",less_than_pivot)
    # print("higher_than_pivot",higher_than_pivot)
    return quick_sort(less_than_pivot)+[pivot]+quick_sort(higher_than_pivot)

## merge sort

def merge_sort(nums):
    if len(nums)<=1:
        return nums

    mid = len(nums)//2

    left_arr = nums[:mid]
    right_arr = nums[mid:]

    left= merge_sort(left_arr)
    right=merge_sort(right_arr)

    sorted_arr=[]
    i=0
    j=0

    while i<len(left) and j<len(right):
        if left[i]<right[j]:
            sorted_arr.append(left[i])
            i+=1
        else:
            sorted_arr.append(right[j])
            j+=1

    sorted_arr+=left[i:]
    sorted_arr+=right[j:]
    return sorted_arr

## bubble sort

def bubble_sort(nums):
    return nums

numbers = [60,76,4,0,5,-6]
# sorted_numbers=[-6,0,4,5,60,76]
# num = 6
# print(binary_search(sorted_numbers,num))
print(merge_sort(numbers))



