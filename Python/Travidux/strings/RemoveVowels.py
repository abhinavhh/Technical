strings = ["hello", "world", "hii"]

vowels = "aeiouAEIOU"

for i in range(len(strings)):
    strings[i] =''.join(ch for ch in strings[i] if ch not in vowels)
print(strings)