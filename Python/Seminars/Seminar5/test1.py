# Последовательностью Фибоначчи называется последовательность чисел a0, a1, ..., an, ..., где
#
# a0 = 0, a1 = 1, ak = ak-1 + ak-2 (k > 1).
#
# Требуется найти N-е число Фибоначчи

import time


def fib_test1(n):
    x = [0, 1]
    for i in range(1, n):
        x.append(x[i]+x[i-1])
    return x[:n+1]


def fib_test1_1(n):
    x = [0, 1]
    fib_num = x[0] + x[1]
    if n in (0, 1):
        return x[n]
    for i in range(2, n):
        x[0], x[1] = x[1], fib_num
        fib_num = x[0] + x[1]
    return fib_num


def fib_test2(n):
    first = 0
    second = 1
    temp_number = first + second
    x = [first, second, temp_number]
    if n in (0, 1):
        return x[:n+1]
    for i in range(2, n):
        first, second = second, temp_number
        temp_number = first + second
        x.append(temp_number)
    return x


def fib_test2_1(n):
    first = 0
    second = 1
    temp_number = first + second
    if n in (0, 1):
        return n
    for i in range(2, n):
        first, second = second, temp_number
        temp_number = first + second
    return temp_number


def fib_rec(n):
    if n in (0, 1):
        return n
    return fib_rec(n-1) + fib_rec(n-2)


num = 35
start = time.perf_counter()
print(fib_test1(num))
end = time.perf_counter()
duration1 = end - start

start = time.perf_counter()
print(fib_test1_1(num))
end = time.perf_counter()
duration2 = end - start

start = time.perf_counter()
print(fib_test2(num))
end = time.perf_counter()
duration3 = end - start

start = time.perf_counter()
print(fib_test2_1(num))
end = time.perf_counter()
duration4 = end - start

start = time.perf_counter()
print(fib_rec(num))
end = time.perf_counter()
duration5 = end - start
print(f"выполнение fib_test1 заняло {duration1:0.20f} секунд")
print(f"выполнение fib_test1_1 заняло {duration2:0.20f} секунд")
print(f"выполнение fib_test2 заняло {duration3:0.20f} секунд")
print(f"выполнение fib_test2_1 заняло {duration4:0.20f} секунд")
print(f"выполнение fib_rec заняло {duration5:0.20f} секунд")

