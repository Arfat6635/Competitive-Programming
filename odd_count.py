integers=[2, 4, 6, 8, 10, 3]
even = []
odd = []
for i in range(0, len(integers)):
    if integers[i] % 2 == 0:
        even.append(integers[i])
    else:
        odd.append(integers[i])

    list1 = (odd if len(even) > len(odd) else even)
    print(list1)
