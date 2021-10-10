a=b=1
N=int(input('количество элементов ряда'))
print(a, b, end="")
for i in range(2,N):
	a, b=b,a+b
	print(b,end='')