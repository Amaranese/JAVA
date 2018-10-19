/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package ejercicio15;
    import java.util.Scanner;
    /**
     *
     * @author ALUMNOS
     */
    public class Ejercicio15 {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // TODO code application logic here
            Scanner ejercicio15 = new Scanner(System.in);
            double radio;
            double volumen;
            System.out.print("Introduzca radio de la esfera: ");
            radio = ejercicio15.nextDouble();
            System.out.println("Volumen de la esfera de radio " + radio + " = " + (4.0/3)* Math.PI * Math.pow(radio, 3));
        }
    }
    
    

