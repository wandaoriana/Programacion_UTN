#Ejercicio6

def calcular_factorial():
    # Definir num como entero
    num = int(input("Ingrese un número: "))
    # Si num < 0 entonces
    if num < 0:
        print("El número debe ser >= 0")
    else:
        factorial = 1
        # Para i = 1 hasta num hacer
        for i in range(1, num + 1):
            factorial = factorial * i
        # Imprimir "El factorial es: ", factorial
        print("El factorial es:", factorial)

# Fin del programa

# Llamar a la función para ejecutar el programa
calcular_factorial()

#Ejercicio7

# Proceso ejercicio

def ejercicio():
    # Definir variables
    suma_pares = 0
    conteo_pares = 0
    promedio = 0.0

    # Pedir al usuario la cantidad de elementos a ingresar
    n_elementos = int(input("Digite la cantidad de elementos a ingresar: "))

    # Inicializar una lista para almacenar los números ingresados
    numeros = []

    # Leer los números y calcular la suma de los pares y el promedio
    for i in range(n_elementos):
        num = int(input(f"Ingrese el número {i+1}: "))
        numeros.append(num)
        if num % 2 == 0:
            suma_pares += num
            conteo_pares += 1

    # Calcular el promedio de los primeros 10 números
    promedio = sum(numeros[:10]) / min(10, len(numeros))

    # Mostrar resultados
    print(f"La suma de los números pares es: {suma_pares}")
    if conteo_pares > 0:
        print(f"El promedio de los números pares es: {suma_pares / conteo_pares}")
    else:
        print("No se ingresaron números pares.")
    
    print(f"El promedio de los primeros 10 números es: {promedio}")

# Llamar a la función para ejecutar el programa
ejercicio()






#Ejercicio8

# Proceso para calcular el salario con horas extras

def calcular_salario(horas_normales, tarifa, horas_extras):
    salario_normal = horas_normales * tarifa
    if horas_extras > 0:
        salario_con_extras = salario_normal + (horas_extras * tarifa)
        print(f"El salario con horas extras es: {salario_con_extras}")
    else:
        print(f"El salario normal es: {salario_normal}")

# Solicitar datos al usuario
horas_trabajadas = int(input("Digite las horas trabajadas: "))
tarifa_horaria = float(input("Digite la tarifa por hora: "))

# Asumir que la jornada normal es de 40 horas
horas_normales = min(horas_trabajadas, 40)
horas_extras = max(0, horas_trabajadas - 40)

# Calcular y mostrar el salario
calcular_salario(horas_normales, tarifa_horaria, horas_extras)