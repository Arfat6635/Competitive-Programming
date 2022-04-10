integer=int(input())
x=[i for i in range(2,integer) if(integer%i)==0]
if len(x)==0:
    print((str(integer) +" is prime"))
else:
    print(x)

