N=int(input("введите N:"))
s=0
pr=1
for i in range(1,N+1):
    pr=pr*i
    s=s+pr
    print(s)