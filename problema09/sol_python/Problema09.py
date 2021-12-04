# Integrantes: JonathanCoronel y Leonardochj
numero1 = 0
numero2 = 0
contador = 1
presentacion = ""
numero = int(input("Ingrese el numero de terminos-->"))
while contador <= numero:
    numero1 = numero1 + 12
    numero2 = numero2 + 11
    contador = contador + 1
    presentacion = "%s+%d-%d" % (presentacion, numero1, numero2)
print(presentacion)