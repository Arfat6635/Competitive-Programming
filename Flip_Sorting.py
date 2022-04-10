# def flip(arr, i, length):
#     for k in range(i, i + length):
#         if arr[k] == 0:
#             arr[k] = 1
#         else:
#             arr[k] = 0
#     return arr



# t = int(input())
# for j in range(t):
#     n = int(input())
#     string = list(map(int, list(input())))

#     starting_indexes = []
#     lengths = []
#     operations = 0
#     for i in range(n):
#         if string[i] == 1:
#             flip(string, i, n - i)
#             operations += 1
#             starting_indexes.append(i + 1)
#             lengths.append(n - i)

#     print(operations)
#     for i in range(operations):
#         print(starting_indexes[i], lengths[i])

from cgitb import reset


s="how are you"
s= s.title()
result=""
for x in s.split():
    result+=x[:-1]+x[-1].capitalize() +" "

print(result)
