/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio26;
import java.util.Scanner;

public class Ejercicio26 {
        int numero;
	int faltante;
	int numeroInvertido;
	int restante;
    public void numeroCapicua(){
Scanner ejercicio26 = new Scanner(System.in);

    
    
        System.out.println("Escriba un numero: ");
        numero=ejercicio26.nextInt();
		
		faltante=numero;
		numeroInvertido=0;
		restante=0;
		
		while(faltante!=0) {
       
	    restante=faltante%10;
        numeroInvertido=numeroInvertido*10+restante;
        faltante=faltante/10;
		
		}
		
	    if(numeroInvertido==numero){
			
        System.out.println("\n El numero es capicua\n");
        
		}else{
       
        System.out.println("\n El numero no es capicua\n");
		
		}
		
		}
	
	public static void main(String args []) {
		
		Ejercicio26 capicua=new Ejercicio26();
		capicua.numeroCapicua();
		
	}

}
