problem=int(input())
output=0
for i in range(problem):
    temp = list(map(int, input().split()))
    counter=0
    for j in range(len(temp)):
        if temp[j]>0:
            counter+=1           
    if counter>=2: 
        output+=1
print(output)
