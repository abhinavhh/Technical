def merge(nums1, m, nums2, n):


    # easy method is 
    #   nums1[m:] = nums2
    #   nums1.sort()

    # another method
    i = m - 1
    j = n - 1
    right = m + n - 1
    while j >= 0 :
        if i >= 0 and nums1[i] > nums2[j]:
            nums1[right] = nums1[i]
            i -= 1
        else:
            nums1[right] = nums2[j]
            j -= 1
        right -= 1 
    print(nums1)

# main code

nums1 = [1, 2, 3, 0, 0, 0]
m = 3
nums2 = [2, 5, 6]
n = 3
merge(nums1, m, nums2, n)