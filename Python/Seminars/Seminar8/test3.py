# Пользователь вводит кол-во строк, затем сами строки. Нужно записать в новый текстовый файл все эти строки
# Далее пользователь вводит символ, нужно найти кол-во этого символа в новом файле.

str_count = int(input('Введите количество строк '))

with open('test3.txt', 'w', encoding='utf-8') as file:
    for i in range(0, str_count):
        file.write(input(f'Введите строку {i+1} ') + '\n')

search_symb = input('Введите символ для поиска ')
count_symb = 0
with open('test3.txt', 'r', encoding='utf-8') as file:
    for line in file.readlines():
        for symb in line:
            if symb == search_symb:
                count_symb += 1

print(f'Найдено {count_symb} символов')

