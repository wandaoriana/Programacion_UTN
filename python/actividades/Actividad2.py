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