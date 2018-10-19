/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio25;

/**
 *
 * @author ALUMNOS
 */
public class Ejercicio25 {
     public void guardar(){
        char[][] tablero = new char[4][4];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = 'x';
            }
        }
        
        System.out.println("Primera forma:");
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.print('\n');
        }
        
        System.out.println("Segunda forma:");
        
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(tablero[i]);
        }
    }
}
