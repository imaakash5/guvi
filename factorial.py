a=int(input("enter a number"))
f=1
if a <=20:
    while a!=0:
        f=f*a
        a-=1
    print(f)
else:
    print("invalid input")
