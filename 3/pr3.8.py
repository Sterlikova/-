N=int(input())
if N<=9:
    for i in range(1,N+1):
        for a in range(1,i+1):
            print(a,end="")
            print()