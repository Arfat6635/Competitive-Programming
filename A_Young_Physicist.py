n=int(input())
x, y, z=0, 0, 0
num1, num2, num3=0, 0, 0
for i in range(n):
    x, y, z=input().split()
    num1+=int(x)
    num2+=int(y)
    num3+=int(z)
 
if num1==0 and num2==0 and num3==0: 
    print("YES")
else:
    print("NO")