# # Дан список чисел. Определите, сколько в нем встречается различных чисел.
# #
# # Дана последовательность из N целых чисел и число K. Необходимо сдвинуть всю последовательность
# # (сдвиг - циклический) на K элементов вправо, K – положительное число.
# #
# # Напишите программу для печати всех уникальных значений в словаре.
# #
# # Дан массив, состоящий из целых чисел. Напишите программу, которая подсчитает количество элементов массива,
# # больших предыдущего (элемента с предыдущим номером)
#
# list_test = []
#
# while True:
#     a = input("Заполните массив")
#     if a == 'q':
#         break
#     else:
#         list_test.append(int(a))
#
# set_test = set(list_test)
#
# print(len(set_test))

#
# list_test = [1, 2, 3, 4, 5, 7, 8, 9]
# k = int(input("Введите число сдвига"))
# value = list_test[k:]
# for i in list_test[:k]:
#     value.append(i)
#
# print(value)

# list_test = [0, -1, 5, 2, 3]
# list_temp = []
# count = 0
# for i in range(len(list_test)-1):
#     if list_test[i] < list_test[i+1]:
#         count += 1
#         list_temp.append(f"{list_test[i]} < {list_test[i+1]}")
#
# print(f"{count}{list_temp}")

# # {2: 3, 4: 3, 4: 5} -> 3, 5
# dict_test = {2: 3, 4: 3, 5: 5}
# set_test = set()
# for i in dict_test:
#     set_test.add(dict_test[i])
# print(set_test)

# # Напишите программу для печати всех уникальных значений в словаре.
#
# some_list = [{"V": "S001"}, {"V": "S002"}, {"VI": "S001"}, {"VI": "S005"}, {"VII": " S005 "}, {" V ": " S009 "},
#              {" VIII ": " S007 "}]
# print(type(some_list))
# print(some_list)
# new_set = set()
# for i in some_list:
#     new_set.add(*i.values())
# print(new_set)



