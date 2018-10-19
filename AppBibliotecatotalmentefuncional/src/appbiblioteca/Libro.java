package appbiblioteca;


public class Libro 
{
    private String nombre;
    private String id;
    
    public Libro(String nombre, String id)
    {
        this.nombre = nombre;
        this.id = id;
    }
    
    public String datosLibro()
    {
        return this.nombre + ' ' + this.id;
    }
    
    String getNombre()
    {
        return this.nombre;
    }
}
