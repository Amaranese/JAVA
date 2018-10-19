/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;
import java.util.Scanner;
/**
 *
 * @author ALUMNOS
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ejercicio14 = new Scanner(System.in);
        
        double cateto;
        double cateto2;
        System.out.println("Introduce el primer cateto: ");
        cateto =  ejercicio14.nextDouble();
        System.out.print("Introduzca longitud del segundo cateto: ");
        cateto2 = ejercicio14.nextDouble();
      System.out.println("Hipotenusa: " +  Math.sqrt(Math.pow(cateto,2)+ Math.pow(cateto2, 2)));
    }
}
       
    
    

