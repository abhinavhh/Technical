def longSubstring(strs):
    char_set = set()
    maxLength = 0
    left = 0
    for right in range(len(strs)):
        while strs[right] in char_set:
            char_set.remove(strs[left])
            left += 1
        char_set.add(strs[right])
        maxLength = max(maxLength , right - left + 1)
    return maxLength
print(longSubstring('abcaabcd')) 