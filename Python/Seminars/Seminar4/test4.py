# Дана строка (возможно,пустая),состоящаяиз букв A-Z: AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB
# Нужно написать функцию RLE,которая на выходе даст строку вида:A4B3C2XYZD4E3F3A6B28 И сгенерирует ошибку,
# если на вход пришла невалидная строка.
# Пояснения:
# Если символ встречается 1 раз , он остается без изменений ;
# Если символ повторяется более 1 раза,
# к нему добавляется количество повторений

import re


def rle(input_string1):
    if not re.match("^[A-Z]*$", input_string1):
        raise ValueError("Invalid input string")

    encoded_string = ""
    count = 1

    for i in range(1, len(input_string1)):
        if input_string1[i] == input_string1[i - 1]:
            count += 1
        else:
            encoded_string += input_string1[i - 1] + (str(count) if count > 1 else "")
            count = 1

    if count > 0:
        encoded_string += input_string1[-1] + (str(count) if count > 1 else "")

    return encoded_string


input_string = "AAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBB"
print(rle(input_string))