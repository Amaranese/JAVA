/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author alejandromaranes
 */
 class Menu {
    private ArrayList<String> opciones;
    public Menu(){
        this.opciones = new ArrayList<String>();
        this.opciones.add("1.-Añadir nuevo socio");
        this.opciones.add("2.-Añadir nuevo libro");
        this.opciones.add("3.-Ver  Socios");
        this.opciones.add("4.-Ver libros");
        this.opciones.add("5.-Borrar socio por Nombre");
        this.opciones.add("6.-Borrar libro por Nombre");
        this.opciones.add("7.-Prestar libro");
        this.opciones.add("8.-Ver prestamos");
        this.opciones.add("9.-Devolver Libro");
        this.opciones.add("10.-Salir");
    }
    int opcion() {
        this.mostrarMenu();
        return this.elegirOpcion();
    }
    
    
    private void mostrarMenu(){
        
    for (int i = 0; i <this.opciones.size(); i++){
        System.out.println(this.opciones.get(i));
    }
}
    private int elegirOpcion(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige una opcion: ");
        int opcion = teclado.nextInt();
        return opcion;
}
}
