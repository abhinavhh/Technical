def isPalindrome(string: str) -> bool:
    return string == string[::-1]

def findTheScore(strs):
    score = 0
    palindrome = []

    for length in [4, 5]:
        for i in range(len(strs) - length + 1):
            newStrs = strs[i: i + length]
            if(isPalindrome(newStrs)):
                palindrome.append(newStrs)
                score += 5 if length == 4 else 10
    return score


strs = input()
result = findTheScore(strs)
print(result)