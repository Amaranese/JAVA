/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;
import java.util.Scanner;
/**
 *
 * @author ALUMNOS
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ejercicio11 = new Scanner(System.in);
        double gradosCº;
        double gradosFº;
      System.out.println("Intruce los grados centígrados correspondientes:");
      gradosCº = ejercicio11.nextDouble();
      gradosFº = 32 + (9 * gradosCº/ 5);
      System.out.println(gradosCº +" ºC = " + gradosFº + " ºF");
  }
}
    
    

