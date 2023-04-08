# Задача 2:
# Найдите сумму цифр трехзначного числа.
#
# *Пример:*
#
# 123 -> 6 (1 + 2 + 3)
# 100 -> 1 (1 + 0 + 0) |

def sum_digit():
    a = int(input("Введите 3 значное число "))
    summ = 0
    while a > 0:
        summ += a % 10
        a = a // 10
    return summ


print(sum_digit())