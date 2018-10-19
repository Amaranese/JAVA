/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;
import java.util.Scanner;
/**
 *
 * @author ALUMNOS
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ejercicio12 = new Scanner(System.in);
        double radio;
        double longitud;
        double area;
        System.out.println("Introduce radio de la circunferencia:");
        radio = ejercicio12.nextDouble();
        longitud = 2 * Math.PI * radio; 
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("Longitud de la circunferencia es: " + longitud);
        System.out.println("Area de la circunferencia es: " + area);
    }
}
    
    

