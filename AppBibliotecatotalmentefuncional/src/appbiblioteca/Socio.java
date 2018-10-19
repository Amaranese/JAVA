
package appbiblioteca;


public class Socio 
{
    private String id;
    private String nombre;
    private String apellido;
    
    public Socio(String nombre, String apellido, String id)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }
    
    public String getSocio()
    {
        return this.nombre + ' ' + this.apellido + ' ' + this.id;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
}
