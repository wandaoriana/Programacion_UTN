nota= int(input("Ingrese su nota : "))
if nota <1 or nota > 10 : 
    print("Pon una nota entre 1 y 10")
else:
    if nota == 9 or nota ==10:
        print("A")
    elif nota >= 8 and nota < 9 :
        print("B") 
    elif nota >= 7 and nota < 8 :
        print("C")

    elif nota >= 6 and nota < 7:
        print("D")
    elif nota > 0 and nota < 6:
        print("F")
