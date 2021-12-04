/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JonathanCoronel y Leonardochj
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);
    
    double x;
    double y;
    String cuadrante = "";
    
    System.out.println("Ingresar coordenada x");
    x = entrada.nextDouble();
    System.out.println("Ingresar coordenada y");
    y = entrada.nextDouble();
    
        
    if ((x >= 0) && (y >= 0)){
        cuadrante = "primer cuadrante";
    }
    if ((x <= 0) && (y >= 0)){
        cuadrante = "segundo cuadrante";
    }
    if ((x <= 0) && (y <= 0)){
        cuadrante = "tercer cuadrante";
    }
    if ((x >= 0) && (y <= 0)){
        cuadrante = "cuarto cuadrante";
    }
    
    System.out.printf("Esta ubicado en el %s\n", cuadrante);
    
    }
    
}
