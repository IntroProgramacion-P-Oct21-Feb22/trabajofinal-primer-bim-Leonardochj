# Integrantes: JonathanCoronel y Leonardochj
suma = 0
inicio = 2
numero = int(input("Ingrese un numero par mayor o igual a dos--->"))
if numero < 2:
    print("Error el numero ingresado es menor a 2 ")
else:
    if numero % 2 == 0:
        while inicio <= numero:
            if inicio % 2 == 0:
             print(inicio)
             suma = suma + inicio
            inicio+= 1

        print("La suma de todos los numeros pares es de :", suma)
    else:
        print("El numero ingresado no es un numero par")