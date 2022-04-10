def find_outlier(integers):
    even = []
    odd = []
    for i in range(0, len(integers)):
        if integers[i] % 2 == 0:
            even.append(integers[i])
        else:
            odd.append(integers[i])

        list1 = (odd if len(even) > len(odd) else even)
        return (''.join(str(e) for e in list1))
    return None

find_outlier([2, 4, 6, 8, 10, 3])