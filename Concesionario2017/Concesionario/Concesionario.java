/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

public class Concesionario {
    
    //private Coche[] coches;
    //private Trabajador[] trabajadores;
    //private Venta[] ventas;
    private Menu menu;
    private boolean fin;
    
    public Concesionario(){
        this.fin = true;
    }
     
    public void run(){
        this.menu = new Menu();
        this.ejecutarSeleccion(this.menu.opcion());
    }
    
    private void ejecutarSeleccion(int opcion){
        while(this.fin){
            switch(opcion){
                case 1:
                    System.out.println("acabas de añadir un coche");
                    break;
                default:
                    break;
                
            }
        }
    }
}
