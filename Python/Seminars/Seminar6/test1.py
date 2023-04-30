# определить простое число или нет рекурсией

def prime_all_rec(number, count=3, idx=0, lst=[2]):
    if count <= number:
        if lst[idx]**2 <= count and count % lst[idx] != 0:
            return prime_all_rec(number, count, idx+1, lst)
        elif lst[idx]**2 > count:
            lst.append(count)
        prime_all_rec(number, count+1, 0, lst)
    if number != 1:
        return lst
    return f"{number} не простое число"


def prime_all(number):
    lst = []
    for i in range(2, number+1):
        for j in range(len(lst)//2):
            if i % lst[j] == 0:
                break
        else:
            lst.append(i)
    if number != 1:
        return lst
    return f"{number} не простое число"


def prime(number, divider=2):
    if divider**2 > number:
        if number == 1:
            return f"{number} не простое число"
        return f"{number} простое число"
    if number % divider == 0:
        return f"{number} не простое число"
    else:
        return prime(number, divider+1)


n = int(input("n="))
print(prime_all_rec(n))
print(prime_all(n))
print(prime(n))



