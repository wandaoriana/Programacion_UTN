                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       mes= None
#Ejercio3
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

#Ejercicio4

edad = None
edad=int(input( "Por favor ingrese su edad: "))
if edad <= 0 or edad > 30 :
    print("Digite su edad entre 0 y 30")
else:
    if edad >= 0 and edad <=10: 
        print("¡La infancia es increíble y bella!")

    elif edad >=10 and edad <=19:
        print("Tienes muchos cambios, mucho que estudiar.")

    elif edad >=20 and edad <=29: 
        print("Amor y confianza el trabajo")


    #Ejercicio5
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

