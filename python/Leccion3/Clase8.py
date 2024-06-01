#Ciclo while (Mientras o durante)

# condicion = True
# while condicion :
#     print ( "Ejecutando el ciclo while")

# else: 
#     print("Fin del ciclo while") #No termina mas si ejecuto esto

# contador = 0
# while contador < 78:
#     print ("Ejecutamos nuestro ciclo while " , contador)

#     contador += 1
# else:
#     print( "Fin del cliclo while")

#     #imprimir numeros del 0 al 5 con el ciclo while
# maximo = 5
# contador = 0
# while contador <= maximo:
#         print(contador)
#         contador += 1 
##        contador = contador + 1
#     #imprimir numeros del 0 al 5 con el ciclo while
# minimo = 1
# contador = 5
# while contador >= minimo:
#         print(contador)
#         contador -= 1 
##contador = contador -1 

# #Ciclo for

# cadena = "Hello"
# for letra in cadena :
#     print(letra)

# else:
#     print("Fin del ciclo for ")


# print(cadena[0])
# for i in range(0,5,1):
#     print(cadena[i])

# for letra in "Alemania":
#     if letra == "a":
#         print(f"Letra encontrada : {letra}")
#         break
#     else:
#         print("Fin del ciclo for")
    
for i in range(6):
    if i % 2 == 0:
        print(f"Valor: {i}")

            
for i in range(6):
    if i % 2  != 0:
        continue
    print(f"Valor: {i}")