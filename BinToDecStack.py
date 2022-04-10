class Stack():
    def __init__(self):
        self.s=[]

    def s_push(self, x):
        self.s.append(x)
    
    def s_pop(self):
        return self.s.pop()

    def s_empty(self):
        return self.s == []
    
    def s_peek(self):
        if not self.s_empty():
            return self.s[-1]

    def s_stack(self):
        return self.s
    
def convert_to_bin(dec_num):
    test=Stack()
    dec_num=int(dec_num)
    while(dec_num>=1):
        q=dec_num//2
        r=dec_num%2
        test.s_push(r)
        dec_num=q
    
    x=""
    while not test.s_empty():
        x+=str(test.s_pop())

    return x


print("Binary number:", convert_to_bin(242))
print(int(convert_to_bin(242),2))