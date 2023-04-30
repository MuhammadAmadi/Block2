# Задача №43.
# Дан список чисел. Посчитайте, сколько в нем пар элементов, равных друг другу. Считается, что любые
# два элемента, равные друг другу образуют одну пару, которую необходимо посчитать. Вводится список
# чисел. Все числа списка находятся на разных строках.
# Ввод:           Вывод:
# 1 2 3 2 3       2

def couple_element(elements):
    elements = sorted(elements)
    count = 0
    temp_count = 1
    for i in range(len(elements)-1):
        if elements[i] == elements[i+1]:
            temp_count += 1
        else:
            count += temp_count//2
            temp_count = 1
    count += temp_count // 2
    return count


def couple_element_rec(elements, idx=0, temp_count=1, b=True):
    if b:
        elements = sorted(elements)
    if idx == len(elements)-1:
        return temp_count // 2
    if elements[idx] == elements[idx+1]:
        return couple_element_rec(elements, idx+1, temp_count+1, False)
    return couple_element_rec(elements, idx+1, 1, False) + temp_count//2


n = "12345"
print(couple_element(n))
print(couple_element_rec(n))
