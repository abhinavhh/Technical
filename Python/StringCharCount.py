fruits = ["apples", "bananas","kivi", "orange", "ab", "akhshduishh"]
temp = ""
for i in range(0, len(fruits) - 1):
    for j in range(0, len(fruits) - i - 1):
        if(len(fruits[j]) > len(fruits[j + 1])):
            temp = fruits[j]
            fruits[j] = fruits[j + 1]
            fruits[j + 1] = temp
print(fruits)