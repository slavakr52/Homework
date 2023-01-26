"""
Найдите сумму цифр трехзначного числа.

Пример:
123 -> 6 (1 + 2 + 3)
100 -> 1 (1 + 0 + 0)
"""

number = input("Введите трёхзначное число: ")
sum = int(number[0]) + int(number[1]) + int(number[2])
print(sum)

#либо

number = int(input("Введите трёхзначное число: "))
sum = int(number%10) + int(number/10%10) + int(number/100%10)
print(sum)
