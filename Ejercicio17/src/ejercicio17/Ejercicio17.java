/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;
import java.util.Scanner;
/**
 *
 * @author ALUMNOS
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner ejercicio17 = new Scanner(System.in);
        int N;
        System.out.print("Introduzca valor de N: ");
        N = ejercicio17.nextInt(); 
        System.out.println("Primera cifra " + N + " -> " + (N/100)); 
        System.out.println("Cifra central " + N + " -> " + (N/10)%10);
        System.out.println("Última cifra " + N + " -> " + (N%10));
         
    }   
} 
    
    

