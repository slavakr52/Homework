# Напишите рекурсивную функцию sum(a, b), возвращающую сумму двух целых 
# неотрицательных чисел. Из всех арифметических операций допускаются 
# только +1 и -1. Также нельзя использовать циклы.

def sum (num1, num2):
    i = 0
    if i == num2:
        return num1
    else: 
        if i < num2:
            i += 1
            return i + sum(num1, num2 - i)
        
num1 = int(input('Введите первое число: '))
num2 = int(input('Введите второе число: '))

print(f'Сумма чисел {num1} и {num2} равна {sum(num1,num2)}')
        
        