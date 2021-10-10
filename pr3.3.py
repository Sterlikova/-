a=int(input("значение а:"))
b=int(input("значение b:"))
if a>b:
    for i in range(a,b-1,-1):
        if i%2!=0:
            print(i)
