package concesionario;

import java.util.ArrayList;
import java.util.Scanner;

class Menu {
    private ArrayList<String> opciones = new ArrayList<String>();
    
    public Menu(){
        this.opciones.add("1.- Añadir coche");
    }
    
    public int opcion(){
        this.mostrarMenu();
        return this.elegirOpcion();
    }
    
    private void mostrarMenu(){
        for (int i = 0; i < this.opciones.size(); i++) {
            System.out.println(this.opciones.get(i));
        }
    }
    
    private int elegirOpcion(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige una opción: ");
        int opcion = teclado.nextInt();
        return opcion;
    }
}
