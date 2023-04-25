# Задача 26:
# Напишите программу,которая на вход принимает два числа A и B, и возводит число А в целую степень B с помощью рекурсии.
#
# *Пример:*
#
# A = 3; B = 5 -> 243 (3⁵)
#     A = 2; B = 3 -> 8


def my_pow(a, b):
    if a == 0 and b < 0:
        return "бесконечность"
    if b % 1 == 0:
        if not isinstance(b, int):
            b = int(b)
        if b >= 0:
            if b == 0:
                return 1
            if b == 1:
                return a
            return a * my_pow(a, b - 1)
        if b == -1:
            return 1 / a
        return 1 / a * my_pow(a, b + 1)
    if a < 0:
        return "Ошибка"
    if 1 > b > -1:
        return a ** b
    return my_pow(a, int(b)) * my_pow(a, b % int(b))


print(my_pow(2, 0.5))
