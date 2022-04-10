def array_diff(a,b):
    return list(filter(lambda v:v not in b,a))

a=[1,3,3,4]
b=[1,3]
print(array_diff(a,b))

    

