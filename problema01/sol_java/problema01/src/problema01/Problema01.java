/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JonathanCoronel y Leonardochj
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);
    
    double angulo1;
    double angulo2;
    double angulo3;
    String tipo_angulo = "";
    String triangulo;
    
    System.out.println("Ingresar el primer angulo");
    angulo1 = entrada.nextDouble();
    System.out.println("Ingresar el segundo angulo");
    angulo2 = entrada.nextDouble();
    System.out.println("Ingresar el tercer angulo");
    angulo3 = entrada.nextDouble();
    
    if ((angulo1 == 90) || (angulo2 == 90) || (angulo3 == 90)){
        tipo_angulo = "rectangulo";
    } else {
        if ((angulo1 < 90) || (angulo2 < 90) || (angulo3 < 90)){
            tipo_angulo = "acutangulo";
    }
    if (((angulo1 > 90) && (angulo1 < 180)) || ((angulo2 > 90) && 
            (angulo2 < 180)) || ((angulo3 > 90) && (angulo3 < 180))){
         tipo_angulo = "obtusangulo";
    } else {
        if ((angulo1 < 90) || (angulo2 < 90) || (angulo3 < 90)){
            tipo_angulo = "acutangulo";
    }
    if ((angulo1 < 90) || (angulo2 < 90) || (angulo3 < 90)){ 
        tipo_angulo = "acutangulo";
    }
    }
    
    triangulo = tipo_angulo;
    System.out.printf("Es un triangulo %s\n", triangulo);
    
    }
    }
}
