def max_sub_array(nums):
    local_maximums=[0]*len(nums)
    for i in range(len(nums)):
        if i==0:
            local_maximums[0]=nums[i]
        else:
            local_maximums[i]=max(nums[i],nums[i]+local_maximums[i-1])
    print(local_maximums)
    return max(local_maximums)

def max_sub_array_optimized(nums):
    local_max=nums[0]
    global_max=nums[0]

    for i in range(1,len(nums)):
        local_max=max(nums[i],nums[i]+local_max)
        if local_max>global_max:
            global_max=local_max

    return global_max

print(max_sub_array_optimized([5,4,-1,7,8]))