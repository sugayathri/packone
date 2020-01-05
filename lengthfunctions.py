a="hello"
b="HELLO"
c="         hello     world        "
print(len(a))
print(a.startswith("h"))
print(a.upper())
print(b.lower())
print(a.strip())
print(a.replace("e","pppp"))
print("o" in a)
print(c.rstrip())
print(c.lstrip())
if(len(a)==10):
    print("pass")
else:
    print("fail")
