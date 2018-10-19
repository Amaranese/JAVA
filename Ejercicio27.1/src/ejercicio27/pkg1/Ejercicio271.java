/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio27.pkg1;

/**
 *
 * @author ALUMNOS
 */
public class Ejercicio271 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       private int[] ordenarMotivao(int[] numeros){
int auxiliar;
for (int i = 0; i < numeros.length - 1; i++) {
if (numeros[i] > numeros[i+1]) {
auxiliar = numeros[i];
numeros[i] = numeros[i+1];
numeros[i+1] = auxiliar;
i = -1;
}
}

    

