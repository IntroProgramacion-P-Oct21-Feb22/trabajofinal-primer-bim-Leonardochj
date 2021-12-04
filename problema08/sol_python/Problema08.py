# Integrantes: JonathanCoronel y Leonardochj
contador1 = 0
contador2 = 0
contador3 = 0
contador4 = 0
inicio = 1
conversion = ""
numero = int(input("Ingrese hasta que numero se haran las conversiones -->"))
while inicio <= numero:
    metros = contador1 + 100
    contador1 = metros
    pmetros = "%d m = %d cm" % (inicio, metros)
    yardas = contador2 + 3
    contador2 = yardas
    pyardas = "%d yd = %d pies" % (inicio, yardas)
    pulgadas = contador3 + 2.54
    contador3 = pulgadas
    ppulgadas = "%d pulg = %.2f cm" % (inicio, pulgadas)
    pies = contador4 + 12
    contador4 = pies
    ppies = "%d ft = %d pulg" % (inicio, pies)
    inicio = inicio+1
    conversion = "%s%s\t%s\t\t%s\t\t%s\n" % (conversion, pmetros, pyardas, ppulgadas, ppies)
print(conversion)