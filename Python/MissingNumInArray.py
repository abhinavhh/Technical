def findSum(num):
    n = len(num) + 1
    totalSum = n * (n + 1) // 2
    return totalSum - sum(num)

num = [1, 2, 4, 5]
print(findSum(num))