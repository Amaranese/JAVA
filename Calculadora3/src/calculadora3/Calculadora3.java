/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora3;

/**
 *
 * @author ALUMNOS
 */
public class Calculadora3 {

      private int x;         
    private int y;        
    private int resultado;           // añadirmos el resultado
    
    
    public Calculadora3() {    
        this.x=0;                              
        
        this.y=0;
        
    }

    public void suma(int x, int y) { 
        
        this.resultado  = x + y;

    }

     public void resta(int x, int y) { 
        
        this.resultado  = x - y;
        }
      
    public void multiplicación(int x, int y) {  
        
        this.resultado  = x * y;
        }
    
    public void división (int x, int y) { 
        
        this.resultado=x / y;
        }   
     
     
     public void mostrar() { 
        System.out.println( "El resultado es: " + this.resultado);
        }
     
      public void iniciarMemoria(int aux) { //hago uso del setter y configuro la variable x
        this.x =  aux;
        System.out.println( "La cantidad guardadada es: "+ this.x);
    }
     
     public int dameMemoria() {
        return this.x;    //  obtengo el numero guardado
    }

   

public static void main(String[] args) {
        Calculadora3 c1=new Calculadora3();   //instancio el objeto
         c1.división(10, 5);   //hago el metodo divison 
        
        
        c1.iniciarMemoria(9); //hago uso del setter y seteo(configuro la variable x)
        int memoria = c1.dameMemoria(); //retorno la variable x  a una variable entera memoria 
        c1.multiplicación(memoria, 5); // hago uso del método  multiplicacion y lo guardo en el aributo resultado
        c1.mostrar();// muestro el valor
        
    }
    

}
