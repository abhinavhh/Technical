str = "Hello"

result = {}
count = 0
for i in range(len(str)):
    for ch in str:
        if(ch == str[i]):
            count += 1
    result[str[i]] = count
    count = 0
print(result)
print()

# least frequent and most frequent
min = 0
max = 0
for k, v in result.items():
    if v > max:
        max = v
min = result[str[0]]
for k, v in result.items():
    if v < min:
        min = v
most_frequent = [k for k, v in result.items() if v == max]
most_least = [k for k, v in result.items() if v == min]
print(most_frequent, ": " , max)
print(most_least , ": " , min)
