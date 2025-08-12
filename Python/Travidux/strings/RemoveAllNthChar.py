n = int(input("Enter the position: "))

strings = ["hello", "world", "hi"]

for i in range(len(strings)):
    if n > len(strings[i]):
        print("Out of index position for :", strings[i])
    else:
        strings[i] = strings[i][:n] + strings[i][n+1:]
        print(strings[i])