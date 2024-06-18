
# Ejercicio1
while True:
    anio = int(input("Ingrese un año para saber si es bisiesto o no: "))
    if (anio % 4 == 0 and anio % 100 != 0) or (anio % 400 == 0):
        print("El año es bisiesto.")
    else:
        print("El año no es bisiesto.")
    
    opcion = int(input("Para continuar adelante digite la opción 1: "))
    if opcion != 1:
        break


# Ejercicio2
n = int(input("Digite la cantidad de números a sumar: "))
suma = 0
for i in range(1, n+1):
    suma += i
print("La suma es:", suma)


# Ejercicio3
n = int(input("Digite la cantidad de números a sumar: "))
suma = 0
numero = 0

if n > 0:
    while numero < n:
        numero += 1
        suma += numero
    print("La suma es:", suma)
else:
    print("El número debe ser mayor que 0.")

#Ejercicio4
# Leer n
n = int(input("Ingrese la cantidad de números: "))

# Inicializar contadores
contador_positivos = 0
contador_negativos = 0
contador_ceros = 0

# Proceso de conteo
for i in range(n):
    numero = float(input("Digite un número: "))
    if numero > 0:
        contador_positivos += 1
    elif numero < 0:
        contador_negativos += 1
    else:
        contador_ceros += 1

# Mostrar resultados
print("La cantidad de números positivos es:", contador_positivos)
print("La cantidad de números negativos es:", contador_negativos)
print("La cantidad de ceros es:", contador_ceros)

#Ejercicio5
# Definimos las variables
suma = 0
calificacion_baja = 9999
#
# Pedimos las calificaciones y realizamos los cálculos
for i in range(10):
    calificacion = float(input("Digite una calificación: "))
    suma += calificacion
    
    if calificacion < calificacion_baja:
        calificacion_baja = calificacion

# Calculamos el promedio
promedio = suma / 10

# Mostramos los resultados
print("El promedio es:", promedio)
print("La nota más baja es:", calificacion_baja)
