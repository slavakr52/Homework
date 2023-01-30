# Требуется вывести все целые степени двойки (т.е. числа вида 2k), не превосходящие числа N.
# Пример:
# 10 -> 1 2 4 8

number = int(input('Введите число: '))
degree_number = 1
i = 0 # будет показывать степень

if number < 1: print('Введите число не менее 1')

while degree_number <= number:
    print(f'2^{i} = {degree_number}')
    degree_number *= 2
    i += 1