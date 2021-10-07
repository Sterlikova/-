def w():
    print("ввод числа")
    year=int(input("год-"))
    print("ответ")
    if((year % 4==0 and year % 100 !=0)or year % 400==0):
        return "да"
    else:
        return "нет"
print(w())