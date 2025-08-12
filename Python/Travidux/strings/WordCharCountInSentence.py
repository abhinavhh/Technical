sentence = "Hello my name is Abhinav U"


# using built in function

# words = sentence.split(' ')
# for word in words:
#     count = 0
#     for i in range(len(word)):
#         count += 1
#     print(word, ": ", count)
    

# Without using built in function
word = ""
words = []

for ch in sentence:
    if ch != ' ':
        word += ch
    else:
        if word:
            words.append(word)
            word = ""

words.append(word)

for word in words:
    print(word,": ", len(word))
