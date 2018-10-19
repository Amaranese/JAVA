
package appbiblioteca;

public class Biblioteca 
{
    private Socio[] socios;
    private Libro[] libros;
    private Menu menu;
    private boolean fin;
    
    public Biblioteca()
    {
        this.socios = new Socio[100];
        this.libros = new Libro[100];
        this.fin = false;
    }
    
    public void run()
    {
        this.menu = new Menu();
        while(!this.fin)
        {
            this.ejecutarSeleccion(this.menu.opcion());
        }
    }
    
    private void salir()
    {
        this.fin = true;
    }
    
    private void ejecutarSeleccion(int opcion)
    {
        GestorSocios socios = new GestorSocios(this.socios);
        GestorLibros libros = new GestorLibros(this.libros);
            switch(opcion)
            {
                case 1:
                    System.out.println("Has elegido añadir nuevo socio");
                    socios.contratarSocio();
                    break;
                case 2:
                    System.out.println("Has elegido la opción añadir nuevo libro");
                    libros.crearLibro();
                    break;
                case 3:
                    System.out.println("Has elegido la opción ver socios");
                    socios.mostrarSocios();
                    break;
                case 4:
                    System.out.println("Has elegido la opción ver libros");
                    libros.mostrarLibros();
                    break;
                case 5:
                    System.out.println("Has elegido la opción borrar socio por nombre");
                    socios.eliminarSocios();
                    break;
                case 6:
                    System.out.println("Has elegido la opción borrar libro por nombre");
                    libros.eliminarLibro();
                    break;
                case 7:
                    this.salir();
                    System.out.println("Programa finalizado");
                    break;
                default:
                    break;
            }
    }
    
}
