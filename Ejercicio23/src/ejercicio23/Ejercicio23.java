/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio23;
import java.util.Scanner;

/**
 *
 * @author ALUMNOS
 */
    public class Ejercicio23 {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {


            // TODO code application logic here
            String[] usuario = new String[5];
            Scanner teclado = new Scanner(System.in);

            Scanner usuarioEscaner = new Scanner(System.in);
            System.out.println("Introduce un usuario: ");
            usuario[0] = teclado.nextLine();
            System.out.println("quieres meter otro usuarios: ");
            String respuesta = teclado.nextLine();


                if (respuesta.equals("y")) {
                    System.out.println("Introduce otro usuario: ");
                    usuario[1] = teclado.nextLine();
                    System.out.println("Quieres meter otro usuario?: ");
                    respuesta = teclado.nextLine();
                } else {
                    System.out.println(usuario[0]);
                }

                System.out.println("Quieres meter otro usuario: ");
                respuesta = teclado.nextLine();

                if (respuesta.equals("y")) {
                    System.out.println("Introduce otro nombre: ");
                    usuario[2] = teclado.nextLine();
                    System.out.println("Quieres meter otro usuario?: ");
                    respuesta = teclado.nextLine();
                    System.out.println(usuario[0]);
                    System.out.println(usuario[1]);
                    System.out.println(usuario[2]);
                    System.out.println(usuario[3]);
                    System.out.println(usuario[4]);
                } else {
                    System.out.println(usuario[0]);
                    System.out.println(usuario[1]);
                    System.out.println(usuario[2]);
                    System.out.println(usuario[3]);
                }
        }
    }
                
       