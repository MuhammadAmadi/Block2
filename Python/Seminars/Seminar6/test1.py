# определить простое число или нет рекурсией
# палиндром или нет рекурсией
# import math
#
# n = int(input("n="))
# lst=[]
# lst.append(2)
# count1 = 0
# count2 = 0
# count3 = 0
# for i in range(2, n+1):
#     count1+=1
#     # пробегаем по списку (lst) простых чисел
#     for j in range(int(math.sqrt(i))):
#         count2+=1
#         if i % lst[j] == 0:
#             break
#     else:
#         count3+=1
#         lst.append(i)
#
# print(count1)
# print(count2)
# print(count3)
# print(lst)
# #[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
# #[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]


def prime_num(n, count=2, idx=0, lst=[], b=False):
    if count >= n:
        return
    if idx < len(lst):
        if count % lst[idx] != 0:
            if idx <= len(lst)//2:
                lst.append(prime_num(n, count, idx+1, lst, True))
    if len(lst) == 0:
        lst.append(count)
    if b:
        return count
    lst.append(prime_num(n, count+1, idx, lst))
    return lst


print(prime_num(15))


