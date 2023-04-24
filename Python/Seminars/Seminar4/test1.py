# 25.
# Напишите программу, которая принимает на вход строку, и выводит кол-во повторов каждого из
# символов 1 раз.


str1 = input("Введите символы")
k = 0
str2 = ""
my_dict = {}
for i in str1:
    if i in my_dict:
        my_dict[i] += 1
        str2 += f"{i}_{my_dict[i]}"
    else:
        my_dict[i] = 0
        str2 += i

print(str2)
