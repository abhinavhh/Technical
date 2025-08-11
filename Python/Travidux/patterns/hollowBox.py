def hollowBox(n):
    for i in range(1, n + 1):
        # Top half
        print("* " * (n - i + 1) + "  " * (i - 1) * 2 + "* " * (n - i + 1))
    for i in range(1, n + 1):
        # Bottom half
        print("* " * i + "  " * (n - i) * 2 + "* " * i)

hollowBox(10)
