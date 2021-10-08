def s():
    print("ввод числа")
    x=int(input())
    y=int(input())
    z=int(input())
    print("ответ")
    if (x==y==z):
        return 3
    elif(x==y or z==y or x==z):
        return 2
    else:
        return 0
print(s())