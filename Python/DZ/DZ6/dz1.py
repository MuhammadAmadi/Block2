# Задача 30:  Заполните массив элементами арифметической прогрессии. Её первый элемент, разность и количество
# элементов нужно ввести с клавиатуры. Формула для получения n-го члена прогрессии: an = a1 + (n-1) * d.
# Каждое число вводится с новой строки.

# entity = [int(x) for x in input("Введите число первого элемента, разность и количество элементов ").split()]
#
# # for i in range(entity[0], entity[0]+entity[2]*entity[1], entity[1]):
# #     print(i, end=' ')
#
# print(' '.join([str(i) for i in range(entity[0], entity[0]+entity[2]*entity[1], entity[1])]))

a, b, c = map(int, input("Введите число первого элемента, разность и количество элементов ").split())

print(' '.join([str(i) for i in range(a, a+c*b, b)]))
