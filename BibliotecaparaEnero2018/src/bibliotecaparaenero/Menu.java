
package bibliotecaparaenero;
import java.util.Scanner;

public class Menu {
    
private String[] opciones;
    
    public Menu()
    {
        opciones = new String[13];
        this.opciones[0] = "1-Añadir nuevo Socio";
        this.opciones[1] = "2-Añadir nueva Familia";
        this.opciones[2] = "3-Añadir nuevo libro";
        this.opciones[3] = "4-Ver socios";
        this.opciones[4] = "5-Ver familias";
        this.opciones[5] = "6-Ver libros";
        this.opciones[6] = "7-Borrar socio por nombre";
        this.opciones[7] = "8-Borrar familia por apellido";
        this.opciones[8] = "9-Borrar libro por nombre";
        this.opciones[9] = "10-Prestar libro a socio";
        this.opciones[10] = "11-Ver prestamos";
        this.opciones[11] = "12-Devolver libro";
        this.opciones[12] = "13-Salir";
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
        System.out.println("Elija  una opción por favor: ");
        int opcion = teclado.nextInt();
        return opcion;
    }
    
    public int opcion()
    {
        this.mostrarMenu();
        return this.elegirOpcion();
    }
}
