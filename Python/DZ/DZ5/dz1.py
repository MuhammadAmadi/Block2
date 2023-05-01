# Задача 26:
# Напишите программу,которая на вход принимает два числа A и B, и возводит число А в целую степень B с помощью рекурсии.
#
# *Пример:*
#
# A = 3; B = 5 -> 243 (3⁵)
#     A = 2; B = 3 -> 8


def my_pow(a, b):
    if a < 0 and b % 1 != 0:
        return "Ошибка"
    if abs(b) >= 1:
        if b > 0:
            return a * my_pow(a, b - 1)
        if a == 0:
            return "бесконечность"
        return 1 / a * my_pow(a, b + 1)
    if b == 0:
        return 1
    return a ** b


print(my_pow(0, -2))
