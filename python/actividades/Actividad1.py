mes= None
mes =int(input("Por favor, ingresa un numero mes (1-12):"))
if mes < 1 or mes > 12:
    print ("Por favor , ingresa un numero valido de mes (1-12)")
else:
    if mes in [1,2,3]:
        print( "Estas en Verano")
    elif mes in [4,5,6]:
        print("Estas en otoño")
    elif mes in [7,8,9]:
        print ("Estas en invierno")
    else: 
        print("Estas en primavera")