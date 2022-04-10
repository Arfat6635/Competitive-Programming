import re
x=input()
output=x.replace("WUB"," ")
print(re.sub(' +', ' ', output))
