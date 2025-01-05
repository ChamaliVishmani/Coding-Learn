def search(nums, target):
    """
    :type nums: List[int]
    :type target: int
    :rtype: int
    """
    start = 0
    end = len(nums)-1

    while start<=end:
        mid = (start+end)//2

        if nums[mid] == target:
            return mid

        # determine if left half is sorted
        if nums[start]<=nums[mid]:
            if nums[start]<=target<nums[mid]:
                end=mid-1
            else:
                start=mid+1
        else:
            #right half is sorted
            if nums[mid]<target<=nums[end]:
                start=mid+1
            else:
                end=mid-1

    return -1


print(search([6,7,3,5],3))
