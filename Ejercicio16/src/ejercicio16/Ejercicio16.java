/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;
import java.util.Scanner;
/**
 *
 * @author ALUMNOS
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ejercicio16 = new Scanner(System.in);
        double a;
        double b;
        double c;
        double d;
        System.out.print("Introduzca longitud del primer lado del triángulo: ");
        a = ejercicio16.nextDouble();
        System.out.print("Introduzca longitud del segundo lado del triángulo: ");
        b = ejercicio16.nextDouble();
        System.out.print("Introduzca longitud del tercer lado del triángulo: ");
        c = ejercicio16.nextDouble();
        d = (a+b+c)/2;
    System.out.println("Area -> " +  Math.sqrt(d*(d-a)*(d-b)*(d-c)));
    }
}
    
    

