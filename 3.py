x = ('иван','Иван','ivan','Ivan')
name=''
while len(name.strip())<1: name=input('Как тебя зовут')
print('Приятно познакомиться,' + name + '!')
if name in x: print('Извините но вы нам не подходите') 
else: age=int(input('Сколько тебе лет'))
if age>=16 and 0<age<75: print('Поздравляем вы поступили в ВГУИТ!')
else: print('Сначало нужно закончить школу')
s=18-age
print('Осталось',s,'лет')