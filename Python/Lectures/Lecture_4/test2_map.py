list_1 = [x for x in range(1,20)]
print(list_1)
list_1 = list(map(lambda x: x + 10, list_1))
print(list_1)
print('Задача 2')
# Задача: С клавиатуры вводится некий набор чисел, в качестве разделителся используется пробел.
# Этот набор чисел считан в качестве строки. Как превратить list строк в list чисел?

list_str = '15 156 96 3 5 8 52 5'
print(list_str)
list_str2 = list_str.split()
print(list_str2)
list_str = list(map(int, list_str.split()))
print(list_str)

# метод map содержит плюс минус код из метода ниже
# def map (f, col):
#     return [f(x) for x in col]
