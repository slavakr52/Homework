# Заполните массив элементами арифметической прогрессии. 
# Её первый элемент, разность и количество элементов нужно ввести с клавиатуры. 
# Формула для получения n-го члена прогрессии: an = a1 + (n-1) * d.
# Каждое число вводится с новой строки.

first_el = int(input('Введите первый элемент прогрессии: '))
diff = int(input('Введите шаг (разность) прогрессии: '))
count = int(input('Введите кол-во элементов прогрессии: '))

list = [first_el]
for i in range(count-1):
    list.append(list[i] + diff)

print(list)