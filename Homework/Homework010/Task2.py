"""
Петя, Катя и Сережа делают из бумаги журавликов. Вместе они сделали S журавликов. 
Сколько журавликов сделал каждый ребенок, если известно, что Петя и Сережа 
сделали одинаковое количество журавликов, а Катя сделала в два раза больше журавликов, 
чем Петя и Сережа вместе?

Пример:
6 -> 1  4  1
24 -> 4  16  4
60 -> 10  40  10
"""

overall_count = int(input('Общее количество журавликов:'))
boy_birds_count = int(overall_count/6)
girl_birds_count = int(boy_birds_count*4)

if overall_count % 6 == 0:
    print(f"Серёжа и Петя сделали по {boy_birds_count} журавликов, а Катя сделала {girl_birds_count} журавликов")
else: print ("Учитывая условие задачи, такое общее количество журавликов не могло получиться")