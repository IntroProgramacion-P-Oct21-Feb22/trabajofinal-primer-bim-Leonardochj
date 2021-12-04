##Integrantes: JonathanCoronel y Leonardochj
nombre_empleado = input("Ingresar el nombre del empleado:")
tipo_empleado = int(input("Ingresar el tipo de empleado: "))
horas_empleadas = int(input("Ingresar las horas Trabajadas:"))
cuota_hora = float(input("Ingresar la cuota que se le paga al Trabajador:"))
sueldo_final=0


if tipo_empleado == 1:
   if horas_empleadas <= 40:
      sueldo_basico = cuota_hora * horas_empleadas
      sueldo_final = sueldo_basico
   else:
      if horas_empleadas > 40:
         hosrasextras= horas_empleadas - 40
         sueldoextra = 1.5 * hosrasextras
         sueldo_basico1 = 40 * cuota_hora
         sueldo_final= sueldo_basico1 + sueldoextra
else:
   if tipo_empleado == 2:
      if horas_empleadas <= 40:
         sueldo_basico = cuota_hora * horas_empleadas
         sueldo_final = sueldo_basico
      else:
         if horas_empleadas > 40:
            hosrasextras = horas_empleadas - 40
            sueldoextra = 2 * hosrasextras
            sueldo_basico1 = 40 * cuota_hora
            sueldo_final = sueldo_basico1 + sueldoextra
   else:
      if tipo_empleado == 3:
         if horas_empleadas <= 40 :
            sueldo_basico = cuota_hora * horas_empleadas
            sueldo_final = sueldo_basico
         else:
          if horas_empleadas > 40:
            hosrasextras = horas_empleadas - 40
            sueldoextra = 2.5 * hosrasextras
            sueldo_basico1 = 40 * cuota_hora
            sueldo_final = sueldo_basico1 + sueldoextra
      else:
         if tipo_empleado == 4:
            if horas_empleadas <= 40:
               sueldo_basico = cuota_hora * horas_empleadas
               sueldo_final = sueldo_basico
            else:
               if horas_empleadas > 40:
                  hosrasextras = horas_empleadas - 40
                  sueldoextra = 3 * hosrasextras
                  sueldo_basico1 = 40 * cuota_hora
                  sueldo_final = sueldo_basico1 + sueldoextra

cadenaFinal = "Nombre:%s\nTipo empleado:%d\nHoras Trabajadas: %d\nCuota Normal: $%.2f" % (
nombre_empleado, tipo_empleado, horas_empleadas, cuota_hora)
print("Los datos del empleado son:\n%s" % cadenaFinal)
print("El sueldo a pagar es:$", sueldo_final)