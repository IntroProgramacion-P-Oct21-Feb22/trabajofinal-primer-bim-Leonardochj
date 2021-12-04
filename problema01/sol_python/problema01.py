##Integrantes: JonathanCoronel y Leonardochj
angulo1 = float(input("Ingrese el primer angulo: "))
angulo2 = float(input("Ingrese el segundo angulo: "))
angulo3 = float(input("Ingrese el tercer angulo: "))
tipo_angulo: str = ""
if angulo1 == 90 or angulo2 == 90 or angulo3 == 90:
    tipo_angulo = "rectangulo"
else:
    if angulo1 > 90 or angulo2 > 90 or angulo3 > 90:
        if angulo1 < 180 or angulo2 < 180  or angulo3 < 180 :
            tipo_angulo = "obtusangulo"
    else:
        if angulo1 < 90 or angulo2 < 90 or angulo3 < 90:
            tipo_angulo = "acutangulo"
triangulo = tipo_angulo
print("Es un rectangulo:  ", triangulo)

