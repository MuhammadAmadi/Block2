# Задача 14: Требуется вывести все целые степени двойки (т.е. числа вида 2k),
#  не превосходящие числа N.

N = int(input(f"Введите число: "))
for i in range(N):
    if 2**i <= N:
        print(f"{2**i}", end=" ")
    else:
        break
