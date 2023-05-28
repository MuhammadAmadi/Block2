# with open('example.txt', 'w', encoding='utf-8') as file:
#     my_list = ['genius', 'dragon', 'console', 'write']
#     for el in my_list:
#         file.write(el+'\n')

import json

# with open('example.json', 'w', encoding='utf-8') as file:
#     my_dict = {1: 'genius', 2: 'dragon', 3: 'console', 4: 'write'}
#     json.dump(my_dict, file)

with open('example.txt', 'w', encoding='utf-8') as file:
    my_dict = {1: 'genius', 2: 'dragon', 3: 'console', 4: 'write'}
    file.write(str(my_dict))
