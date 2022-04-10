a,b=input().split()
withdraw=int(a)
total=float(b)
tax=float(0.50) 
if withdraw%5==0 and withdraw<total and (withdraw+0.5)<=total:
    cost=total-withdraw
    print(cost-tax)
else:
    print(total)