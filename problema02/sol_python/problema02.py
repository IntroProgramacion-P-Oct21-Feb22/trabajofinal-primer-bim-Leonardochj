##Integrantes: JonathanCoronel y Leonardochj
cantidad_trajes = int(input("Ingresar la cantidad de trajes: "))
precio_unitario = float(input("Ingresar el precio unitario: "))
porcentaje1 = 20
porcentaje2 = 25
porcentaje3 = 40
porcentaje4 = 50

subtotal = precio_unitario * cantidad_trajes

if cantidad_trajes == 1:
    descuento = (subtotal * porcentaje1)/100
    valor_total = subtotal - descuento
if cantidad_trajes == 2:
    descuento = (subtotal * porcentaje2)/100
    valor_total = subtotal - descuento
if cantidad_trajes == 3:
    descuento = (subtotal * porcentaje3)/100
    valor_total = subtotal - descuento
if cantidad_trajes > 3:
    descuento = (subtotal * porcentaje4)/100
    valor_total = subtotal - descuento

valor_final = valor_total

print("El subtotal es:$", subtotal)
print("El descuento es:$", descuento)
print("El valor a pagar es:$", valor_final)
