# Дан список интов,повторяющихся элементов в списке нет. Нужно преобразовать это множество в строку, сворачивая
# соседние по числовому ряду числа в диапазоны.
# Примеры
# :
# [1,4,5,2,3,9,8,11,0] => "0-5,8-9,11"
# [1,4,3,2] => "1-4"
# [1,4] => "1,4"

l2 = [1,4,5,2,3,9,8,11,0]
l2.sort()
print(l2)


def method1(l1):
    my_list = []
    count = -1
    for i in range(0, len(l1)):
        count += 1
        if i == len(l1)-1 or l1[i+1] - l1[i] > 1:
            last = l1[i]
            first = l1[i - count]
            if first == last:
                my_list.append(f"{first}")
            else:
                my_list.append(f"{first}-{last}")

            count = -1
    return my_list


def method2(l1):
    final = []
    temp = []
    print_list = []
    for i in range(len(l1)):
        if i == len(l1)-1 or l1[i+1]-1 == l1[i]:
            temp.append(l1[i])
        else:
            temp.append(l1[i])
            final.append(temp)
            temp = []
    if temp:
        final.append(temp)
    for i in final:
        if len(i) > 1:
            print_list.append(f"{i[0]}-{i[-1]}")
        else:
            print_list.append(f"{i[0]}")
    return ','.join(print_list)


print(*method1(l2), sep=",")
print(method2(l2))
