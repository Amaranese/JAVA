
package biblioteca;


class Socio {
    private String nombre;
    private String apellido;
    private String dni;
    
    
    public Socio(String Nombre, String Apellido, String DNI){
        this.nombre = Nombre;
        this.apellido = Apellido;
        this.dni = DNI;
    }
        
public String datosSocio(){
    return this.nombre + ' ' + this.apellido + ' ' + this.dni;
        
}


    String getSocio(){
        return this.dni;
    }
}
