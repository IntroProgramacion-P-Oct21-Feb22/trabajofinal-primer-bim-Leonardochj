/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JonathanCoronel y Leonardochj
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre_empleado;
        int horas_empleadas;
        double cuota_hora;
        String cadenaFinal;
        int tipo_empleado;
        double sueldo_basico;
        double sueldo_final = 0;
        double horas_extras;
        double sueldo_extra;
        double sueldo_basico1;

        System.out.println("Ingresar el nombre del empleado");
        nombre_empleado = entrada.nextLine();
        System.out.println("Ingresar el tipo de empleado");
        tipo_empleado = entrada.nextInt();
        System.out.println("Ingresar las horas empleadas");
        horas_empleadas = entrada.nextInt();
        System.out.println("Ingresar la cuota que se le paga por hora");
        cuota_hora = entrada.nextDouble();

        if (tipo_empleado == 1) {
            if (horas_empleadas <= 40) {
                sueldo_basico = cuota_hora * horas_empleadas;
                sueldo_final = sueldo_basico;
            } else {
                if (horas_empleadas > 40) {
                    horas_extras = horas_empleadas - 40;
                    sueldo_extra = 1.5 * horas_extras;
                    sueldo_basico1 = 40 * cuota_hora;
                    sueldo_final = sueldo_basico1 + sueldo_extra;
                }
            }
        } else {
            if (tipo_empleado == 2) {
                if (horas_empleadas <= 40) {
                    sueldo_basico = cuota_hora * horas_empleadas;
                    sueldo_final = sueldo_basico;
                } else {
                    if (horas_empleadas > 40) {
                        horas_extras = horas_empleadas - 40;
                        sueldo_extra = 2 * horas_extras;
                        sueldo_basico1 = 40 * cuota_hora;
                        sueldo_final = sueldo_basico1 + sueldo_extra;
                    }
                }
            } else {
                if (tipo_empleado == 3) {
                    if (horas_empleadas <= 40) {
                        sueldo_basico = cuota_hora * horas_empleadas;
                        sueldo_final = sueldo_basico;
                    } else {
                        if (horas_empleadas > 40) {
                            horas_extras = horas_empleadas - 40;
                            sueldo_extra = 2.5 * horas_extras;
                            sueldo_basico1 = 40 * cuota_hora;
                            sueldo_final = sueldo_basico1 + sueldo_extra;
                        }
                    }
                } else {
                    if (tipo_empleado == 4) {
                        if (horas_empleadas <= 40) {
                            sueldo_basico = cuota_hora * horas_empleadas;
                            sueldo_final = sueldo_basico;
                        } else {
                            if (horas_empleadas > 40) {
                                horas_extras = horas_empleadas - 40;
                                sueldo_extra = 3 * horas_extras;
                                sueldo_basico1 = 40 * cuota_hora;
                                sueldo_final = sueldo_basico1 + sueldo_extra;
                            }
                        }
                    }
                }
            }
        }

        cadenaFinal = String.format("%s\nTipo %d\n%d\n$%.2f\n", nombre_empleado,
                tipo_empleado, horas_empleadas, cuota_hora);
        System.out.printf("Datos personales son:\n%s\n", cadenaFinal);
        System.out.printf("El sueldo a pagar es $%.2f\n", sueldo_final);

    }

}
