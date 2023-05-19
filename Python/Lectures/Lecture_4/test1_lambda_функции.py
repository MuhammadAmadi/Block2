# В списке хранятся числа. Нужно выбрать только четные числа, и нужно составить список пар (число, квадрат числа)

mylist = [1, 2, 3, 5, 8, 15, 23, 38]

## Вариант 1
def select (f, col):
    return [f(x) for x in col]

def where (f, col):
    return [x for x in col if f(x)]


res = list()
res = select(int, mylist)
# print(res)
res = where(lambda x: x % 2 == 0, res)
# print(res)
res = select(lambda x: (x, x**2), res)
print(res)

## Вариант2
lambdaDef2 = list(map(lambda x: (x, x**2),[i for i in mylist if i % 2 == 0]))
print(lambdaDef2)

## Вариант3
lambdaDef = lambda x: [(i,i**2) for i in x if i % 2 == 0]
print(lambdaDef(mylist))
