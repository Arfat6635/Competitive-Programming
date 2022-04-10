total_word = int(input())
word = []
for i in range(total_word):
    ele = input()
    word.append(ele)

for i in range(len(word)):
    if len(word[i]) <=10:
        print(word[i])
    else:
        word_list = list(word[i])
        first_letter = word_list[0]
        last_letter = word_list[-1]
        total_length = len(word[i])-2
        print(first_letter+str(total_length)+last_letter)
