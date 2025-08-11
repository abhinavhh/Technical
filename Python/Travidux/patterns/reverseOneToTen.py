def numberPattern(n):
    a = 1
    for i in range(1, n + 1):
        val = a
        for j in range(i):
            print(val, end="  ")
            val = val - 1
        a = a + i + 1
        print()

numberPattern(4)
