# 25.
# Напишите программу, которая принимает на вход строку, и выводит кол-во повторов каждого из
# символов 1 раз.


str1 = input("Введите символы")
k = 0
str2 = ""
dict = {}
for i in str1:
    if i in dict:
        dict[i] += 1
        str2 += f"{i}_{dict[i]}"
    else:
        dict[i] = 0
        str2 += i

print(str2)

