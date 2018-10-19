/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;
import java.util.Scanner;

/**
 *
 * @author ALUMNOS
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ejercicio19 = new Scanner (System.in);
         Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Introduzca valor de N: ");
        N = sc.nextInt();  //supondremos que el número introducido tiene 5 cifras
        System.out.println(N%10);
        System.out.printf("%02d %n",N%100);
        System.out.printf("%03d %n",N%1000);
        System.out.printf("%04d %n",N%10000);
        System.out.printf("%05d %n",N);
    }
}
    
