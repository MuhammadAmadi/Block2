# Напишите функцию read_last(lines, file), которая будет открывать определенный файл file и
# выводить на печать построчно последние строки в количестве lines
# (на всякий случай проверим, что задано положительное целое число).
# Протестируем функцию на файле «article.txt» со следующим содержимым:
#
# Вечерело
# Жужжали мухи
# Светил фонарик
# Кипела вода в чайнике
# Венера зажглась на небе
# Деревья шумели
# Тучи разошлись
# Листва зеленела

def read_last(lines, file):
    if lines < 0:
        print('Введите положительное число')
    else:
        with open(file, 'r', encoding='utf-8') as file:
            my_lines = file.read()
            print(my_lines)

read_last(4,'article.txt')