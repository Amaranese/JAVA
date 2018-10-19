
package appbiblioteca;

import java.util.Scanner;


public class Menu 
{
    private String[] opciones;
    
    public Menu()
    {
        opciones = new String[7];
        this.opciones[0] = "1-Añadir nuevo Socio";
        this.opciones[1] = "2-Añadir nuevo libro";
        this.opciones[2] = "3-Ver socios";
        this.opciones[3] = "4-Ver libros";
        this.opciones[4] = "5-Borrar socio por nombre";
        this.opciones[5] = "6-Borrar libro por nombre";
        this.opciones[6] = "7-Salir";
    }
    private void mostrarMenu()
    {
        for(int i = 0; i < opciones.length; i++)
        {
            System.out.println(this.opciones[i]);
        }
    }
    
    private int elegirOpcion() 
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige una opción: ");
        int opcion = teclado.nextInt();
        return opcion;
    }
    
    public int opcion()
    {
        this.mostrarMenu();
        return this.elegirOpcion();
    }
}
