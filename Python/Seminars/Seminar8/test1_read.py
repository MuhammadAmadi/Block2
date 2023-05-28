# with open('example.txt', 'r', encoding='utf-8') as file:
#     text = file.read()
#     print(text)

# with open('example.txt', 'r', encoding='utf-8') as file:
#     line = file.readline()
#
#     while line:
#         print(line, end='')
#         line = file.readline()

# with open('example.txt', 'r', encoding='utf-8') as file:
#     text = file.read()
#     print(text.splitlines())

with open('example.txt', 'r', encoding='utf-8') as file:
    text = file.readlines()
    print(text)
