a = int(input())
b = 0
while a != 0:
    N = int(input())
    if N != 0 and a < N:
        b += 1
    a = N
print(b)