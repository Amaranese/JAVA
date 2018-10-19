package concesionario;

import java.util.Scanner;

class Menu {
    private String[] opciones = new String[1];
    
    public Menu(){
        this.opciones[0] = "1.- Añadir coche";
    }
    
    public int opcion(){
        this.mostrarMenu();
        return this.elegirOpcion();
    }
    
    private void mostrarMenu(){
        for (int i = 0; i < this.opciones.length; i++) {
            System.out.println(this.opciones[i]);
        }
    }
    
    private int elegirOpcion(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige una opción: ");
        int opcion = teclado.nextInt();
        return opcion;
    }
}
