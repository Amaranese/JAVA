/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio24;
import java.util.Scanner;

/**
 *
 * @author ALUMNOS
 */
public class Ejercicio24 {
    public void opcion(){
        System.out.println("1.- Inicio");
        System.out.println("2.- Jugar");
        System.out.println("3.- Guardar");
        System.out.println("4.- Cargar");
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige una opcion: ");
        int opcion = teclado.nextInt();
        
        while( 1 > opcion || opcion > 4){
            System.out.println("Elige otra opcion, esta mal colega: ");
            opcion = teclado.nextInt();
        }
        
        switch(opcion){
            case 1:
                System.out.println("Inicio");
                break;
            case 2:
                System.out.println("Jugar");
                break;
            case 3:
                System.out.println("Guardar");
                break;
            case 4:
                System.out.println("Cargar");
                break;
        }          
    }
}
