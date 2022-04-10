n, k=input().split()
result=[]
for i in range(1,int(n)+1):
    if(i%2!=0):
        result.append(i)

for i in range(1,int(n)+1):
    if(i%2==0):
        result.append(i)

print(result[int(k)-1])
