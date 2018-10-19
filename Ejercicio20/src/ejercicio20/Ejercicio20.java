/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package ejercicio20;
    import java.util.Scanner;

    /**
     *
     * @author ALUMNOS
     */
    public class Ejercicio20 {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // TODO code application logic here
            Scanner ejercicio20 = new Scanner(System.in);
            int dia;
            int mes;
            int año; 
            int suerte;
            int suma;
            int cifraa;
            int cifrab;
            int cifrac;
            int cifrad;
            System.out.println("Introduzca fecha de nacimiento");
            System.out.print("día: ");
            dia = ejercicio20.nextInt();
            System.out.print("mes: ");
            mes = ejercicio20.nextInt();
            System.out.print("año: ");
            año = ejercicio20.nextInt();
            suma = dia + mes + año;
            cifraa = suma/1000;      
            cifrab = suma/100%10;  
            cifrac = suma/10%10;   
            cifrad = suma%10;        
            suerte = cifraa + cifrab + cifrac + cifrad;
            System.out.println("Su número de la suerte es: " + suerte);
        }
    }
  