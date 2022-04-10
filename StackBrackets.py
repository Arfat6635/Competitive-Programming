def is_match(p1, p2):
    if p1 == "(" and p2 == ")":
        return True
    elif p1 == "{" and p2 == "}":
        return True
    elif p1 == "[" and p2 == "]":
        return True
    else:
        return False


def is_paren_balanced(paren_string):
    s=[]
    is_balanced = True
    index = 0
    while index < len(paren_string) and is_balanced:
        paren = paren_string[index]
        if paren in "([{":
            s.append(paren)
        else:
            if not s:
                is_balanced = False
            else:
                top = s.pop()
                if not is_match(top, paren):
                    is_balanced = False
        index += 1
    
    if not s and is_balanced:
        return True
    else:
        return False


print("String : (((({})))) Balanced or not?")
print(is_paren_balanced("(((({}))))"))
print("String : [][]]] Balanced or not?")
print(is_paren_balanced("[][]]]"))
print("String : [][] Balanced or not?")
print(is_paren_balanced("[][]"))
