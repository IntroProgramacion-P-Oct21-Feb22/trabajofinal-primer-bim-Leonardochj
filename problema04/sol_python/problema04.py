##Integrantes: JonathanCoronel y Leonardochj
primer_numero = int(input("Ingrese el primer numero: "))
segundo_numero = int(input("Ingrese el segundo numero: "))
tercer_numero = int(input("Ingrese el tercer numero: "))

if (primer_numero == segundo_numero) and (primer_numero == tercer_numero) and (segundo_numero == tercer_numero):
    mensaje1 = "Error"
    print("El mensaje es", mensaje1)
else:
    if (primer_numero > segundo_numero) and (primer_numero > tercer_numero) and (segundo_numero != tercer_numero):
        numero_mayor1 = primer_numero
        mensaje = numero_mayor1
    if (primer_numero < segundo_numero) and (primer_numero != tercer_numero) and (segundo_numero > tercer_numero):
        numero_mayor2 = segundo_numero
        mensaje = numero_mayor2
    if (primer_numero != segundo_numero) and (primer_numero < tercer_numero) and (segundo_numero < tercer_numero):
        numero_mayor3 = tercer_numero
        mensaje = numero_mayor3

    print("El numero mayor es", mensaje)