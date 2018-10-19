
package bibliotecaparaenero;


public class GestorLibros extends Gestor
{
    private Libro[] libros;
    private String pedirDato;
    
    public GestorLibros(Libro[] libros)
    {
        this.libros = new Libro[100];
        this.libros = libros;
        
    }
    public void crearLibro()
    {
        Libro libro = this.introducirLibro();
        this.guardarLibro(libro, this.dimeIndiceDisponible());
    }
    
    private Libro introducirLibro()
    {
        return new Libro(this.pedirDato("Introduce el nombre del libro: ")
                ,this.pedirDato("Introduce la editorial"), this.pedirDato("Introduzca el id"));
    }
    public Libro getLibro(String nombre)
    {
        Libro libro = new Libro("nombre","editorial", "id");
        return libro;
    }
    
    private int dimeIndiceDisponible()
    {
        for (int i = 0; i < this.libros.length; i++)
        {
            if (this.libros[i] == null)
            {
                return i;
            }
        }
        return -1;
    }
    
    private void guardarLibro(Libro libro, int indiceDisponible)
    {
        this.libros[indiceDisponible] = libro;
    }
    
    public void mostrarLibros()
    {
        for(int i = 0; i < this.libros.length; i++)
        {
            if (this.libros[i] != null)
            {
                System.out.println(this.libros[i].datosLibro());
            }
        }
    }
    
    private void quitarLibroStock(String nombre)
    {
        for (int i = 0; i < this.libros.length; i++)
        {
            if (this.libros[i] != null && this.libros[i].getNombre().equals(nombre))
            {
                this.libros[i] = null;
            }
        }
    }
    
    public void eliminarLibro()
    {
        this.mostrarLibros();
        this.quitarLibroStock(this.pedirDato("Introduce el nombre del libro que desea eliminar:  "));
    }
}