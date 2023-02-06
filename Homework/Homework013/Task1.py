# Даны два неупорядоченных набора целых чисел (может быть, с повторениями).
# Выдать без повторений в порядке возрастания все те числа,
# которые встречаются в обоих наборах.
# Пользователь вводит 2 числа. n - кол-во элементов первого множества.
# m - кол-во элементов второго множества. Затем пользователь вводит
# сами элементы множеств.

# 11 6
# 2 4 6 8 10 12 10 8 6 4 2
# 3 6 9 12 15 18
# 6 12

from random import randint as rnd

list1_count = int(input('Введите кол-во элементов первого множества: '))
list2_count = int(input('Введите кол-во элементов второго множества: '))

list1 = []
for _ in range(list1_count):
    list1.append(rnd(1,20))
print(list1)
list1 = set(list1)

list2 = []
for _ in range(list2_count):
    list2.append(rnd(1,10))
print(list2)
list2 = set(list2)

total_list = list1.intersection(list2)
total_list = list(total_list)

if len(total_list) == 0:
    print('Пересечений нет')
else: print(f'В обоих множествах есть эти числа: {sorted(total_list)}')


