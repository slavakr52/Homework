# На столе лежат n монеток. Некоторые из них лежат вверх решкой, 
# а некоторые – гербом. Определите минимальное число монеток, 
# которые нужно перевернуть, чтобы все монетки были повернуты 
# вверх одной и той же стороной. Выведите минимальное количество монет, 
# которые нужно перевернуть

from random import randint

coins_count = int(input('Введите количество монет: '))
coin_eagle = 0 #монетки с орлом
coin_tails = 0 #монетки с решкой

for _ in range(coins_count):
    coin_value = randint(0, 1)
    if coin_value == 0:
        coin_eagle += 1
    else: coin_tails += 1

print(f'Монет с решкой: {coin_tails}')
print(f'Монет с орлом: {coin_eagle}')

if coin_eagle < coin_tails:
    print(f'Перевернуть нужно минимум {coin_eagle} монет')
else: print(f'Перевернуть нужно минимум {coin_tails} монет')