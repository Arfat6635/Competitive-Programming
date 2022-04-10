def binaryToDecimal(n): 
    n=''.join(map(str,n))
    return int(n,2)

print(binaryToDecimal([1,0,0,1]))