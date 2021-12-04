/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JonathanCoronel y Leonardochj
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);
    
    int cantidad_trajes;
    double subtotal;
    double descuento = 0;
    double valor_total = 0;
    double precio_unitario;
    int porcentaje1 = 20; 
    int porcentaje2 = 25;
    int porcentaje3 = 40;
    int porcentaje4 = 50;
    double valor_final;
    
    System.out.println("Ingresar la cantidad de trajes");
    cantidad_trajes = entrada.nextInt();
    System.out.println("Ingresar el precio unitario");
    precio_unitario = entrada.nextDouble();
        
    subtotal = precio_unitario * cantidad_trajes;
            
    if (cantidad_trajes == 1){
        descuento = (subtotal*porcentaje1)/100;
        valor_total = subtotal - descuento;
    }
    if (cantidad_trajes == 2){
        descuento = (subtotal*porcentaje2)/100;
        valor_total = subtotal - descuento;
    }
    if (cantidad_trajes == 3){
        descuento = (subtotal*porcentaje3)/100;
        valor_total = subtotal - descuento;
    }
    if (cantidad_trajes > 3){
        descuento = (subtotal*porcentaje4)/100;
        valor_total = subtotal - descuento;
    }
    
    valor_final = valor_total;
    
    System.out.printf("El subtotal es:$%.2f\n", subtotal);
    System.out.printf("El descuento es:$%.2f\n", descuento);
    System.out.printf("El valor total a pagar es:$%.2f\n", valor_final);
    
    }
    
}
