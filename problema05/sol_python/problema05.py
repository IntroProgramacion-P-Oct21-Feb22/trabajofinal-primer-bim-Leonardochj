##Integrantes: JonathanCoronel y Leonardochj
x = float(input("Ingresar la coordenada x: "))
y = float(input("Ingrese la coordenada y: "))

if (x >= 0) and (y >= 0):
   cuadrante = "primer cuadrante"
if (x <= 0) and (y >= 0):
   cuadrante = "segundo cuadrante"
if (x <= 0) and (y <= 0):
   cuadrante = "tercer cuadrante"
if (x >= 0) and (y <= 0):
   cuadrante = "cuarto cuadrante"

print("Esta ubicado en el", cuadrante)
