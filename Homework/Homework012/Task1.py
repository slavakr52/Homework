# Первая задача:
# Задаем длину списка наполненного рандомными числами от 1 до 100.
# Вводим искомое число X
# Программа должна вывести в консоль сколько раз встречается в заданном списке искомое число X,
# которое мы вводим с клавиатуры, либо выводим на экран, максимально близкое ему по значению

from random import randint as rnd

list = list()
list_length = int(input('Введите размер списка: '))
for _ in range(list_length):
    list.append(rnd(1,100))

count = 0
near_element = 0
search_number = int(input('Введите искомое число в диапазоне 0-100: '))
for i in range(list_length):
    if search_number == list[i]:
        count+=1
        near_element = list[i]
print()
print(f'Число {search_number} встречается в сгенерированном списке {count} раз')

if count == 0:
    a = search_number
    b = search_number
    for i in range(100):
        for j in range(list_length):
            if a == list[j] or b == list[j]:
                near_element = list[j]
                break
        if near_element !=0:
            break
        else:
            a-=1
            b+=1
    print(f'Число {near_element} из этого списка ближе всех по значению к числу {search_number}')







