list1 = ['user1', 'user2', 'user3', 'user4', 'user5']
list2 = [34, 678, 345, 56, 6787, 8, 76, 9]
list3 = ['345', 45, 'rf4', 3, 5555, 789]

res = list(zip(list1, list2, list3))

print(res)
print('Enumerate')
res2 = list(enumerate(list1))
print(res2)
res2 = list(enumerate(list2))
print(res2)
res2 = list(enumerate(list3))
print(res2)
