from collections import Counter

str1 = "listen"
str2 = "silenp"

if len(str1) != len(str2):
    print("Not Anargam")

else:
    if Counter(str1) == Counter(str2):
        print("Anargam")
    else:
        print("Not Anargam")