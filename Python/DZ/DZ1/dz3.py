# Задача 6:
# Вы пользуетесь общественным транспортом? Вероятно, вы расплачивались за проезд и
# получали билет с номером. Счастливым билетом называют такой билет с шестизначным номером,
# где сумма первых трех цифр равна сумме последних трех.
# Т.е. билет с номером 385916 – счастливый, т.к. 3+8+5=9+1+6.
# Вам требуется написать программу, которая проверяет счастливость билета.
#
# *Пример:*
#
# 385916 -> yes
# 123456 -> no


ticket_number = input("Введите номер билета ")
if ticket_number.isdigit() and len(ticket_number) > 5:

    first_number = int(ticket_number[:3])
    last_number = int(ticket_number[-3:])

    first_sum = last_sum = 0

    while first_number > 0 or last_number > 0:

        first_sum += first_number % 2
        last_sum += last_number % 2

        first_number //= 10
        last_number //= 10

    if first_sum == last_sum:
        message = "YES"
    else:
        message = "NO"
else:
    message = "Ошибка\nВведите 6 значное число"


print(message)