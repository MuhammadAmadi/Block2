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

n = int(input("Введите длину списка "))
list_test = []
for i in range(n):
    list_test.append(i+1)
print(list_test)
x = int(input("Введите искомое число "))
idx = 0
list_temp = []
for i in list_test:
    list_temp.append(x-i)
for i in range(len(list_temp)):
    if list_temp[i] == min(list_temp):
        idx = i
print(f"-> {list_test[idx]}")
