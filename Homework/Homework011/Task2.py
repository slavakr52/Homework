# Петя и Катя – брат и сестра. Петя – студент, а Катя – школьница. Петя помогает 
# Кате по математике. Он задумывает два натуральных числа X и Y (X,Y≤1000), 
# а Катя должна их отгадать. Для этого Петя делает две подсказки. Он называет 
# сумму этих чисел S и их произведение P. Помогите Кате отгадать задуманные Петей числа.
# Пример:
# 4 4 -> 2 2
# 5 6 -> 2 *

sum = int(input('Введите сумму загаданных чисел: '))
mult = int(input('Введите произведение загаданных чисел: '))

for i in range(0,1000):
    for j in range (0,1000):
        if i + j == sum and i * j == mult:
            first_number = i
            second_number = j
            break

print(f'Первое загаданное число - {first_number}, второе загаданное число - {second_number}')

