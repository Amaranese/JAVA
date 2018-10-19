
package bibliotecaparaenero;


public class Libro {
    
private String nombre;
    private String editorial;
    private String libro;
    private final String id;
    
    public Libro(String nombre, String editorial, String id)
    {
        this.nombre = nombre;
        this.editorial = editorial;
        this.id =  id;
    }

    

    
    
    public String datosLibro()
    {
        return this.nombre + ' ' + this.id + ' ' + this.editorial;
    }
    
    String getNombre()
    {
        return this.nombre;
    }
    public String getLibro(){
    return this.libro;
    }
}