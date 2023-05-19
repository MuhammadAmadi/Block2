my_data = [15, 65, 9, 36, 175]
my_list = list(filter(lambda x: x % 10 == 5, my_data))
print(my_list)


# метод filter содержит плюс минус код из метода ниже
# def filter (f, col):
#     return [x for x in col if f(x)]
