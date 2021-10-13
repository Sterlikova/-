a=int(input("значение а:"))
b=int(input("значение b:"))
if a<b:
    for i in range(a,b+1):
        print(i)
elif a>b:
    for i in range(a,b-1,-1):
        print(i)
