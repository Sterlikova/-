def s():
    print("ввод чисел")
    n=int(input())
    m=int(input())
    k=int(input())
    print("ответ")
    if(n * m > k and (k % m == 0 or k % n == 0)):
        return "да"
    else:
        return "нет"
    print(s())