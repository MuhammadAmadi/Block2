# Дан список интов,повторяющихся элементов в списке нет. Нужно преобразовать это множество в строку, сворачивая
# соседние по числовому ряду числа в диапазоны.
# Примеры
# :
# [1,4,5,2,3,9,8,11,0] => "0-5,8-9,11"
# [1,4,3,2] => "1-4"
# [1,4] => "1,4"

l1 = [1,4,5,2,3,9,8,11,0]
l1.sort()
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

print(*my_list,  sep=',')
