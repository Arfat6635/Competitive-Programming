
n, m, a = map(int, input().split())

'''

a=flagstone size
n,m=square size


Try to fit the flagstone into the square

'''

length=int(n/a)
breadth=int(m/a)

if n%a!=0:
    length+=1
if m%a!=0:
    breadth+=1
print(length*breadth)    






