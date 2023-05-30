# Создать телефонный справочник с
# возможностью импорта и экспорта данных в
# формате .txt. Фамилия, имя, отчество, номер
# телефона - данные, которые должны находиться
# в файле.
# 1. Программа должна выводить данные
# 2. Программа должна сохранять данные в текстовом файле
# 3. Пользователь может ввести одну из характеристик для поиска определенной
# записи(Например имя или фамилию человека)
# 4. Использование функций. Ваша программа не должна быть линейной
# Дополнить телефонный справочник возможностью изменения и удаления данных.
# Пользователь также может ввести имя или фамилию, и Вы должны реализовать
# функционал для изменения и удаления данных


def view(name):
    with open(name, 'r', encoding='utf-8') as book:
        print(book.read(), end='')


def add(name):
    with open(name, 'a', encoding='utf-8') as book:
        fio_number = ' : '.join(line())
        if len(search_l(name, fio_number)) == 0:
            book.write(fio_number+"\n")
            print(fio_number)
        else:
            print('Точно такая запись уже существует')


def line():
    fio = input('Введите ФИО ')
    number = input('Введите номер телефона ')
    return [fio, number]


def search(name):
    search_str = input('Введите ФИО или номер телефона для поиска ')
    return search_l(name, search_str)


def search_l(name, search_line):
    result = []
    with open(name, 'r', encoding='utf-8') as book:
        number_book = book.read().split('\n')
    for line_s in number_book:
        if search_line in line_s:
            result.append(line_s)
    return result


def edit(name):
    line_edit = (search(name))
    selected = range(0, 1)
    if len(line_edit) > 1:
        print(f"\nНадйено {len(line_edit)} записей")
        print(*line_edit, sep='\n')
        selected = input('Введите y - чтобы редактировать все, или введите порядковый номер записи для редактирования')
        if selected == 'y':
            selected = range(0, len(line_edit))
        elif int(selected) > len(line_edit):
            print('запись с таким порядковым номером не существует')
            return
        else:
            selected = int(selected)
            selected = range(selected-1, selected)
    with open(name, 'r', encoding='utf-8') as book:
        number_book = book.read().split('\n')
    idx = 0
    for i in selected:
        for j in range(idx, len(number_book)):
            if line_edit[i] == number_book[j]:
                idx = j
                print(f'Введите новые данные для записи')
                print(line_edit[i])
                line_edit = number_book[j].split(' : ')
                new_line = line()
                for k in range(0, len(line_edit)):
                    if len(new_line[k]) > 0:
                        line_edit[k] = new_line[k]
                number_book[j] = ' : '.join(line_edit)
    with open(name, 'w', encoding='utf-8') as book:
        book.write("\n".join(number_book))


def deleted(name):
    line_del = (search(name))
    selected = range(0, 1)
    if len(line_del) > 1:
        print(f"\nНадйено {len(line_del)} записей")
        print(*line_del, sep='\n')
        selected = input('Введите y - чтобы удалить все, или введите порядковый номер записи для удаления')
        if selected == 'y':
            selected = range(0, len(line_del))
        elif int(selected) > len(line_del):
            print('запись с таким порядковым номером не существует')
            return
        else:
            selected = int(selected)
            selected = range(selected - 1, selected)
    with open(name, 'r', encoding='utf-8') as book:
        number_book = book.read().split('\n')
    for i in selected:
        number_book.remove(line_del[i])
    with open(name, 'w', encoding='utf-8') as book:
        book.write("\n".join(number_book))


phone_book = 'phone_book.txt'

with open(phone_book, 'a', encoding='utf-8') as file:
    file.write('')

while True:

    choice = input('Выберите действие\n1-просмотр, 2-добавление, 3-поиск, 4-редактирование, 5-удаление, 6-выход\n=> ')

    if choice == '1':
        view(phone_book)
    elif choice == '2':
        add(phone_book)
    elif choice == '3':
        line_search = search(phone_book)
        print(f"\nНадйено {len(line_search)} записей")
        print(*line_search, sep='\n')
    elif choice == '4':
        edit(phone_book)
    elif choice == '5':
        deleted(phone_book)
    else:
        break
