# Дана строка (возможно,пустая),состоящаяиз букв A-Z: AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB
# Нужно написать функцию RLE,которая на выходе даст строку вида:A4B3C2XYZD4E3F3A6B28 И сгенерирует ошибку,
# если на вход пришла невалидная строка.
# Пояснения:
# Если символ встречается 1 раз , он остается без изменений ;
# Если символ повторяется более 1 раза,
# к нему добавляется количество повторений

import re


def rle(string):

    # for i in string:
    #     if i not in "ABCDEFGHIJKLMNOPQRSTUVWXYZ":
    #         return "Неверная строка"

    if not re.match("^[A-Z]*$", string):
        return "Неверная строка"

    brief_str = ""
    count = 1

    for i in range(1, len(string)):
        if string[i] == string[i - 1]:
            count += 1
        else:
            brief_str += string[i - 1] + (f"{count}" if count > 1 else "")
            count = 1

    if count > 0:
        brief_str += string[-1] + (f"{count}" if count > 1 else "")

    return brief_str


input_str = "AAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB"
print(rle(input_str))
