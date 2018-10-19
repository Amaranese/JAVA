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
        this.fin = false;
    }
     
    public void run(){
        this.menu = new Menu();
        while(!this.fin){
           this.ejecutarSeleccion(this.menu.opcion()); 
        }
    }
    
    private void salir(){
        this.fin = true;
    }
    
    private void ejecutarSeleccion(int opcion){
        switch(opcion){
            case 1:
                System.out.println("acabas de añadir un coche\n");
                break;
            case 9:
                this.salir();
                System.out.println("Hasta pronto!");
                break;
            default:
                break;

        }
    }
}
