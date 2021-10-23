s = input()
x = s[:s.find('h')]
y = s[int(s.find('h')):int(s.rfind('h') + 1)]
z = s[s.rfind('h') + 1:]
print(x+ y[::-1] + z)
