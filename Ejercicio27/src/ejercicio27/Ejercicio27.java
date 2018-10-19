/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio27;
import java.util.*;
/**
 *
 * @author ALUMNOS
 */
public class Ejercicio27 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                int[] elemento_uno = {5,1,6,7,3};
		int[] elemento_dos = {6,1,7,5,3};
		int comparacion = 0;
		
		int constante  = 0;
		int cont = 0;
		
Random rnd = new Random();
		int valorDado = rnd.nextInt(999999999);
		int finaly = 0;
		
		for(int i = 0; i < 5;i++){
			finaly++;
			if(comparacion == 5){
				System.out.println("Si son iguales");
				return;
			}
			if(comparacion < 5 && finaly >= 16){
				System.out.println("No son iguales");
				return;
			}
			
			
			if(cont > 4){
				cont = 0;
				constante++;
			}
			if(elemento_uno[constante] == elemento_dos[cont]){
				comparacion++;
				elemento_dos[cont] = valorDado;
				constante++;
				cont = -1;
			}
			cont++;
			if(i ==4){
				i = 0;
				
			}
			
		}
		
		
		
		
		
		
	}

}
                 
			 
			 
		 