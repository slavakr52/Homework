# Напишите программу, которая на вход принимает два числа A и B, 
# и возводит число А в целую степень B с помощью рекурсии. >

def degree (num, deg_num):
    i = 0
    if deg_num == 0:
        return 1
    elif deg_num == 1:
        return num
    else:
        i += 1
        return num * degree(num, deg_num - i)
    
num = int(input('Введите число: '))
deg_num = int(input('Введите степень, в которую будем возводить число: '))

print(f'Число {num} в степени {deg_num} равно {degree(num, deg_num)}')
    
