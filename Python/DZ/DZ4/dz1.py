# Задача 22:
# Даны два неупорядоченных набора целых чисел (может быть, с повторениями). Выдать без повторений в порядке
# возрастания все те числа, которые встречаются в обоих наборах.
# Пользователь вводит 2 числа. n — кол-во элементов первого множества. m — кол-во элементов второго множества.
# Затем пользователь вводит сами элементы множеств.
import random

n = int(input("Введите количество элементов первого множества "))
m = int(input("Введите количество элементов второго множества "))
x = input("Введите 1 чтобы ввести значения вручную, или любой джругой символ чтобы заполнить рандомно")

one_set = set()
two_set = set()
if x == 1:
    for i in range(n):
        one_set.add(int(input("Введите элемент первого множества")))

    for i in range(m):
        two_set.add(int(input("Введите элемент второго множества")))
else:
    for i in range(n):
        one_set.add(random.randint(-n, n + n // 2))

    for i in range(m):
        two_set.add(random.randint(-m, m + m // 2))

print(one_set)
print(two_set)
list_temp = []

for i in one_set:
    for j in two_set:
        if i == j:
            list_temp.append(i)
            break


list_temp.sort()

set_value = set(list_temp)

print(set_value)
