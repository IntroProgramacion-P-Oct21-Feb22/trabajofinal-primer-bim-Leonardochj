/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema09;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author  JonathanCoronel y Leonardochj

 */
public class Problema09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solución del ejercicio 09
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int numero;
        int numero1 = 0;
        int numero2= 0;
        int contador =1; 
        String presentacion = "";
        System.out.println("Ingrese el número de terminos a presentar ");
        numero = entrada.nextInt();
        while (contador <= numero){
        numero1=numero1 + 12;
        numero2=numero2 + 11;
        contador = contador +1;
        presentacion = String.format("%s+%d-%d"
                ,presentacion, numero1, numero2);
        }
        System.out.printf("%s\n",presentacion);
    }
    
}
