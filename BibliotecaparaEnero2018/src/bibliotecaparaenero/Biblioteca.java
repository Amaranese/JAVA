
package bibliotecaparaenero;


public class Biblioteca {
    
    private Socio[] socios;
    private Libro[] libros;
    private Familia[] familias;
    private Prestamo[] prestamos;
    private Menu menu;
    private boolean fin;
    
    
    public Biblioteca()
    {
        this.socios = new Socio[100];
        this.libros = new Libro[100];
        this.familias = new Familia[100];
        this.prestamos = new Prestamo[100];
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
        GestorFamilias familias = new GestorFamilias(this.familias);
        GestorPrestamos prestamos = new GestorPrestamos(this.prestamos);
        
        
            switch(opcion){
                case 1:
                    
                    socios.crearSocio();
                    break;
                case 2:
                    familias.crearFamilia();
                    break;
                case 3:
                    libros.crearLibro();
                    break;
                case 4:
                    socios.mostrarSocios();
                    break;
                case 5:
                    familias.mostrarFamilias();
                    break;
                case 6:
                    libros.mostrarLibros();
                    break;
                case 7:
                    socios.eliminarSocios();
                    break;
                case 8:
                    familias.eliminarFamilias();
                    break;
                case 9:
                    libros.eliminarLibro();
                    break;
                case 10:
                    prestamos.crearPrestamo();
                    break;
                case 11:
                    prestamos.mostrarPrestamos();
                    break;
                case 12:
                    prestamos.devolverPrestamo();
                    break;
                case 13:
                    this.salir();
                    System.out.println("Programa finalizado");
                    break;
                default:
                    break;
            }
    }
}
            
