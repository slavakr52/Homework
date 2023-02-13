# Определить индексы элементов массива (списка), значения 
# которых принадлежат заданному диапазону (т.е. не меньше 
# заданного минимума и не больше заданного максимума)

from random import randint as rnd

min = 10
max = 12

list = []
for i in range(20):
    list.append(rnd(1, 100))

list_of_index = []
for i in range(len(list)):
    if min <= list[i] <= max:
        list_of_index.append(i)

print(list)
print(list_of_index)

