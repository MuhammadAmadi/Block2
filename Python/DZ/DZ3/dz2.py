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
idx = 0
max_val = abs(x - list_test[idx])
for i in range(1, len(list_test)):
    if abs(x - list_test[i]) < max_val:
        max_val = abs(x - list_test[i])
        idx = i

print(f"-> {list_test[idx]}")
