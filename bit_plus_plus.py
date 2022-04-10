bit = int(input())
global points
points=0
for y in range(bit):
    temp=input()
    if temp[1]=="+":
        points+=1
    else:
        points-=1


print(points)