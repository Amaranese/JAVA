/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author ALUMNOS
 */
    public class Ejercicio7 {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // TODO code application logic here

            int C = 9;
            if (C >= 0 )
                {System.out.println("Es positivo");}
                else if (C <= 0)
                {System.out.println("Es negativo");}
            if (C%2 == 0 )
                {System.out.println("Es par");}
                else if (C%2 !=0)
                {System.out.println("Es impar");}
            if (C%5 == 0)
                {System.out.println("Es multiplo de 5");}
                else if (C%5 !=0)
                {System.out.println("No es multiplo de 5");}
            if (C%10 ==0)
                {System.out.println("Es múltiplo de 10");}
                else if (C%10 !=0)
                {System.out.println("No es múltiplo de 10");}
            if (C > 100)
                {System.out.println("El numero es mayor de 100");}
            else if (C < 100)
                {System.out.println("El numero es menor que 100");}


        }

    }
