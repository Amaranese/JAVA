
package bibliotecaparaenero;


public class Socio {
    private String dni;
    private String nombre;
    private String apellido;
    
public Socio(String nombre, String apellido, String dni)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    
    public String getSocio()
    {
        return this.nombre + ' ' + this.apellido + ' ' + this.dni;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
}
