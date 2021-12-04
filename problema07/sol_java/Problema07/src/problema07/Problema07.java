/*
 * Elaborar un programa que permita leer un número par y calcule e imprima 
 * la suma de los números pares del 2 hasta el número leído. Si el número leído
 * es menor a 2 debe imprimir un mensaje de error.
 */
package problema07;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Integrantes: JonathanCoronel y Leonardochj
 */
public class Problema07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solución del ejecicio 07
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int numero;
        int inicio = 2;
        int suma = 0;
        System.out.println("Ingrese un numero par mayor o igual a dos");
        numero = entrada.nextInt();
        if (numero < 2) {
            System.out.printf("Error el numero ingresado es menor a 2\n");
        } else {
            if (numero % 2 == 0) {
                while (inicio <= numero) {
                    if (inicio % 2 == 0) {
                        System.out.printf("%d\n", inicio);
                        suma = suma + inicio;
                        inicio = inicio + 2;
                    }
                }
                System.out.printf("La suma de todos los numeros "
                        + "pares es de :%d\n", suma);
            }else {
                        System.out.printf("El numero ingresado no es un"
                                + " numero par\n");
                    }
        }
    }

}
