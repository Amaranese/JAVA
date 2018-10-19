/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;
import java.util.Scanner;
/**
 *
 * @author ALUMNOS
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner qwer = new Scanner(System.in);
         int numerito;
        System.out.println("Introduce un número entero:");
        numerito = qwer.nextInt();
        System.out.println("Número introducido: " + numerito);
        System.out.println("Doble de " + numerito + " -> "+ 2*numerito);
        System.out.println("Triple de " + numerito + " -> "+ 3*numerito);
        
    }
}
    
    

