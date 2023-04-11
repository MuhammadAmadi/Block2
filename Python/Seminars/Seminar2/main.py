# 9. По данному целому неотрицательному n вычислите значение n!. N! = 1 * 2 * 3 * … * N
#  (произведение всех чисел от 1 до N) 0! = 1 Решить задачу используя цикл while)

# 11. Дано натуральное число A > 1. Определите, каким по счету числом Фибоначчи оно является,
#  то есть выведите такое число n, что φ(n)=A. Если А не является числом Фибоначчи, выведите число -1.

# 15. Иван Васильевич пришел на рынок и решил купить два арбуза: один для себя,
#  а другой для тещи. Понятно, что для себя нужно выбрать арбуз потяжелей, а для тещи полегче.
#  Но вот незадача: арбузов слишком много и он не знает как же выбрать самый легкий и самый тяжелый арбуз?
#  Помогите ему!
#  Пользователь вводит одно число N – количество арбузов. Вторая строка содержит N чисел, записанных на
#  новой строчке каждое. Здесь каждое число – это масса соответствующего арбуза. Все числа натуральные и не
#  превышают 30000.

import random


def task9():
    n = int(input("Введите число N: "))
    fact = 1
    while n >= 0:
        fact *= n
        n -= 1
        if n == 0:
            print(fact)
            break
    else:
        print(1)


def task11():
    a = int(input("Введите число F: "))
    fib = [0, 1]
    while fib[len(fib) - 1] < a:
        fib.append(fib[len(fib) - 2] + fib[len(fib) - 1])
    if a != fib[len(fib)-1]:
        print(-1)
    else:
        print(len(fib))


def task11_2():
    a = int(input("Введите число F: "))
    fiba = 0
    fibb = 1
    count = 2
    while fibb < a:
        fibc = fiba + fibb
        fiba = fibb
        fibb = fibc
        count += 1
    if a != fibb:
        print(-1)
    else:
        print(count)


def task13():
    value = int(input("Введите количество дней: "))
    temper = list()
    for _ in range(0, value):
        temper.append(random.randint(-50, 51))
    print(temper)
    count = 0
    max_ = 0
    for i in temper:
        if i > 0:
            count += 1
        else:
            if max_ <= count:
                max_ = count
            count = 0
    print(max_)


def task13_1():
    value = int(input("Введите количество дней: "))
    temper = list()
    for _ in range(0, value):
        temper.append(int(input()))
    print(temper, end=' ')
    temper.append(-5)
    count = 0
    max_ = 0
    for i in temper:
        if i > 0:
            count += 1
        else:
            if max_ <= count:
                max_ = count
            count = 0
    print(max_)


def task15():
    value = int(input("Введите количество арбузов: "))
    melon = list()
    for _ in range(0, value):
        melon.append(random.randint(1, 10))
    print(melon)
    min_ = melon[0]
    max_ = min_
    for el in melon:
        if el < min_:
            min_ = el
        if el > max_:
            max_ = el
    print(min_, max_)


def task16():
    a = int(input("A"))
    b = int(input("B"))
    for i in range(a, b + 1):
        for j in range(2, i // 2 + 1):
            if i % j == 0:
                break
        else:
            print(i)
