# Integrantes: JonathanCoronel y Leonardochj
var1 = float(input("Escriba cada numero segido de un enter, para Terminar digie un 0 y dele enter -->"))
contador = 0
badera = True
acMedia: float = 0
acMedia2: float = 0
while var1 != 0:
    acMedia = acMedia + var1
    acMedia2 = acMedia2 + var1 * var1
    var1 = float(input())
    contador = contador + 1
media = acMedia/contador
varianza = acMedia2/(contador-1)-(pow(acMedia, 2)) /(contador*(contador-1))
resultado = "La media es :%.2f\nLa varianza muestral es: %.2f\n" %(media , varianza)
print(resultado)
