# Integrantes: JonathanCoronel y Leonardochj
limite = 100
numerador = 1
denominador = 1
suma = 0
while denominador <= limite:
    suma = suma + (numerador/denominador)
    denominador = denominador + 1
sumafinal = "La suma es: %.2f" % suma
print(sumafinal)
