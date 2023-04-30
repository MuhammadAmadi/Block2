# Задача 32: Определить индексы элементов массива (списка), значения которых принадлежат заданному диапазону
# (т.е. не меньше заданного минимума и не больше заданного максимума)
import random

my_rand_list = [random.randint(-20, 50) for i in range(random.randint(10, 40))]
print(my_rand_list)
first, last = map(int, input("Введите диапазон чисел через пробел например -20 50 ").split())
print(" ".join([str(i) for i in range(len(my_rand_list)) if first <= my_rand_list[i] <= last]))
