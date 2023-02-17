# Винни-Пух попросил Вас посмотреть, есть ли в его стихах ритм. 
# Поскольку разобраться в его кричалках не настолько просто, насколько 
# легко он их придумывает, Вам стоит написать программу. Винни-Пух считает, 
# что ритм есть, если число слогов (т.е. число гласных букв) в каждой фразе 
# стихотворения одинаковое. Фраза может состоять из одного слова, если во фразе 
# несколько слов, то они разделяются дефисами. Фразы отделяются друг от друга 
# пробелами. Стихотворение  Винни-Пух вбивает в программу с клавиатуры. 
# В ответе напишите “Парам пам-пам”, если с ритмом все в порядке и “Пам парам”, 
# если с ритмом все не в порядке.

#=============================================================================

input = 'Парам пам пам'

def vinny_control(vinny_string: str):
    vinny_string = vinny_string.lower()
    vinny_list = vinny_string.split()
    letters_count = lambda x: sum(1 for i in x if i in 'уеыаояиюёэ')
    
    control_list = []                                    
    for i in vinny_list:                       # это как вышло первоначально без сахара
        control_list.append(letters_count(i))  # дальше пробуем сокращать (ниже)

    if all (i == control_list[0] for i in control_list):
        print('Парам пам-пам')
    else: print('Пам парам')
    
vinny_control(input)

#=============================================================================

vinny_poem = input('Вот стишок Винни-Пуха: ')

def vinny_control(vinny_string: str):
    vinny_list = vinny_string.lower().split()
    letters_count = lambda x: sum(1 for i in x if i in 'уеыаояиюёэ')
    if all(letters_count(i) == letters_count(vinny_list[0]) for i in vinny_list):
        return 'Парам пам-пам'
    return 'Пам парам'
    
print(vinny_control(vinny_poem))



