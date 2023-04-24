# Хакер Василий получил доступ к классному журналу и хочет заменить все свои минимальные оценки
# на максимальные. Напишите программу, которая заменяет оценки Василия, но наоборот: все максимальные – на минимальные.
import random


def exchange(list_rating):
    min_rating = list_rating[0]
    max_rating = list_rating[0]
    for i in list_rating:
        if min_rating > i:
            min_rating = i
        if max_rating < i:
            max_rating = i
    for i in range(len(list_rating)):
        if list_rating[i] == max_rating:
            list_rating[i] = min_rating
    return list_rating


list_1 = [random.randint(1, 6) for _ in range(5)]

print(list_1)
print(exchange(list_1))
