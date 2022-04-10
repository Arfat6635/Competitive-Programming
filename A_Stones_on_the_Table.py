n=int(input())
s=input()
z=s[0]
count=0
for i in range(1,len(s)):
    if(z==s[i]):
        count=count+1
    z=s[i]

print(count)
