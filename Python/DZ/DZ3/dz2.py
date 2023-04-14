# Задача 18:
# Требуется найти в списке A[1..N] самый близкий по величине элемент к заданному числу X.
# Пользователь в первой строке вводит натуральное число N – количество элементов в списке.
# В последующих  строках записаны N целых чисел Ai. Последняя строка содержит число X
#
# *Пример:*
#
# 5
#     1 2 3 4 5
#     6
#     -> 5
import random

n = int(input("Введите длину списка "))
list_test = []
for i in range(n):
    list_test.append(random.randint(-n, n+n//2))

print(list_test)
x = int(input("Введите число "))
list_temp = []
for i in list_test:
    list_temp.append(abs(x-i))

idx = list_temp.index(min(list_temp))

print(f"-> {list_test[idx]}")
