def duplicates(nums):
    seen = set()
    duplicate = []
    for num in nums:
        if num in seen:
            duplicate.append(num)
        else:
            seen.add(num)
    return duplicate

nums = [int(input("Enter elements : ")) for i in range(5)]
print(duplicates(nums))