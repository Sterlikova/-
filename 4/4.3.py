s = input()
w = int(len(s))
x = int(len(s))//2 +1
f = str(s[x:w]) + str(s[:x])
print(f)
