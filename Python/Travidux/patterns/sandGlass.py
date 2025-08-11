def sandGlass(n):
    for i in range(1, n + 1):
        print(" " * (n - n + i - 1) + "* " * (n - i + 1) + " " * (n - n + i - 1), end="")
        print()
    for i in range(1, n + 1):
        print(" " * (n - i) + "* " * (i) + " " * (n - i + 1), end="")
        print()
sandGlass(5)