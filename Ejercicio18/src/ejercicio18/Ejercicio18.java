/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;
import java.util.Scanner;

/**
 *
 * @author ALUMNOS
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner ejercicio18 = new Scanner(System.in);
        int a;
        System.out.print("Introduzca valor de N: ");
        a = ejercicio18.nextInt(); //supondremos que el número introducido tiene 5 cifras
        System.out.println(a/10000);
        System.out.println(a/1000);
        System.out.println(a/100);
        System.out.println(a/10);
        System.out.println(a);
    }
}
    

