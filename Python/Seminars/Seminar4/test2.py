# Пользователь вводит текст(строка). Словом считается последовательность непробельных символов идущих подряд,
# слова разделены одним или большим числом пробелов или символами конца строки.Определите, сколько различных
# слов содержится в этом тексте.
# без метода split()

str1 = "She sells sea shells on the sea shore The shells that she sells are sea shells I'm sure.So if she sells sea " \
       "shells on the sea shore I'm sure that the shells are sea shore shells"
print(str1)
str1 = str1.lower()
# str1 = input("Введите слова")
# str1 += " "
set_test = set()
temp_str = ""
for i in str1:
    if i == " ":
        if temp_str:
            set_test.add(temp_str)
        temp_str = ""
    else:
        temp_str += i

print(set_test)
print(len(set_test))

