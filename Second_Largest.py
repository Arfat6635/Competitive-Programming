t=int(input())
for i in range(t):
    a=list(map(int,input().split()))
    a.sort(reverse=True)
    print(a[1])