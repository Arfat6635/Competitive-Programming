n,k=map(int,input().split())
digits=[]
for i in range(n):
    temp=int(input())
    output=temp%k
    digits.append(output)

print(digits.count(0))


