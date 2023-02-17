# Напишите функцию print_operation_table(operation, num_rows=6, num_columns=6), 
# которая принимает в качестве аргумента функцию, вычисляющую элемент по номеру 
# строки и столбца. Аргументы num_rows и num_columns указывают число строк и столбцов
# таблицы, которые должны быть распечатаны. Нумерация строк и столбцов идет с единицы 
# (подумайте, почему не с нуля). Примечание: бинарной операцией называется любая операция, 
# у которой ровно два аргумента, как, например, у операции умножения.

#===================================Попытка 1==========================================

# def print_operation_table(num_rows=6, num_columns=6):
#     for i in range(1, num_columns + 1):
#         str1 = ''
#         for j in range (1, num_rows + 1):
#             a = i + j
#             b = str(a)                     # тут запутался, начал заново (ниже)
#             if len(b) == 1:
#                 str1 += '     ' + b
#             if len(b) == 2:
#                 str1 += '    ' + b

#         print(str1)

# print_operation_table()

#===================================Попытка 2==========================================

print('Данная программа выводит на экран одну из таблиц: сложения (1) или умножения (2)\n'
      'Количество столбцов и строк по умолчанию 9 на 9')
table_number = int(input('Какую таблицу вы хотите вывести? Введите её номер: '))

oper_1 = lambda x, y: x + y
oper_2 = lambda x, y: x * y

def print_operation_table(operation, num_rows=9, num_columns=9):
    if table_number == 1:
        for i in range(num_columns + 1):
            list = []
            for j in range (num_rows + 1):       
                list.append(str(operation(i, j)))   
            print('\t'.join(list))
    if table_number == 2: 
        for i in range(1, num_columns + 1):
            list = []
            for j in range (1, num_rows + 1):       
                list.append(str(operation(i, j)))   
            print('\t'.join(list)) 

if table_number != 1 and table_number != 2: 
    print('Такой таблицы нет')
elif table_number == 1:        
    print_operation_table(oper_1)
else:
    print_operation_table(oper_2)



