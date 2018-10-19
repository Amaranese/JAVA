/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio28;
import java.util.Scanner;

/**
 *
 * @author ALUMNOS
 */
public class Ejercicio28 {
    private Scanner teclado;
    private int[] numeros;
    public void cargar() {
        teclado=new Scanner(System.in);
       numeros=new int[5];
        for(int f=0;f<numeros.length;f++) {
            System.out.print("Ingrese un numero: ");
            numeros[f]=teclado.nextInt();
        }
    }
	
    public void ordenar() {
        for(int k=0;k<4;k++) {
            for(int f=0;f<4-k;f++) {
                if (numeros[f]<numeros[f+1]) {
                    int aux;
                    aux=numeros[f];
                    numeros[f]=numeros[f+1];
                    numeros[f+1]=aux;
                }
            }
        }
    }
	
    public void imprimir() {
        System.out.println("Numeros ordenados de mayor a menor: ");
        for(int f=0;f<numeros.length;f++) {
            System.out.println(numeros[f]);
        }
    }
   
public static void main(String[] args) {
    Ejercicio28 pv=new Ejercicio28();
        pv.cargar();
        pv.ordenar();
        pv.imprimir();
    }
}
    
    
    
    
