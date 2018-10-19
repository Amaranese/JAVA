/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaparaenero;

/**
 *
 * @author ALUMNOS
 */
class GestorPrestamos extends Gestor{
    private Prestamo[] prestamos;
    
    
    public GestorPrestamos(Prestamo[] prestamos){
        this.prestamos = new Prestamo[100];
        this.prestamos = prestamos;
    }
    
    public void mostrarPrestamos() {
        for (int i = 0; i < this.prestamos.length; i++) {
            if (this.prestamos[i] != null) {
                System.out.println(this.prestamos[i].nombreSocio());
            }
            
        }
         for (int i = 0; i < this.prestamos.length; i++) {
            if (this.prestamos[i] != null) {
                System.out.println(this.prestamos[i].nombreLibro());
            }
         }
    }
    
   public void crearPrestamo(){
        Prestamo prestamo = this.introducirPrestamo();
        
        this.guardarPrestamo(prestamo, this.dimeIndiceDisponible());  
    }
    
    private Prestamo introducirPrestamo(){
        Libro libro = new Libro (this.pedirDato("Introduce el nombre del libro: ")
                ,this.pedirDato("Introduce la editorial"), this.pedirDato("Introduzca el id"));
        Socio socio = new Socio (this.pedirDato("Introduce el nombre del socio"), this.pedirDato("Introduce el apellido del socio"), this.pedirDato("Introduce el Dni del socio"));
        return new Prestamo (libro, socio);
    }
    
    
    private void guardarPrestamo(Prestamo prestamo, int indiceDisponible){
        this.prestamos[indiceDisponible] = prestamo;
    } 
    
    private int dimeIndiceDisponible(){
        for (int i = 0; i < this.prestamos.length; i++) {
            if (this.prestamos[i] == null) {
                return i; 
            }
        }
        return -1;
    }
    
    private void quitarPrestamoStock(String libro, String socio) {
        for (int i = 0; i < this.prestamos.length; i++) {
            if (this.prestamos[i] != null && this.prestamos[i].nombreSocio().equals(socio)) {
                this.prestamos[i] = null;
            }
        }
        for (int i = 0; i < this.prestamos.length; i++) {
            if (this.prestamos[i] != null && this.prestamos[i].nombreLibro().equals(libro)) {
                this.prestamos[i] = null;
            }
        }
    }
    
    public void devolverPrestamo(){
        this.mostrarPrestamos();
        this.quitarPrestamoStock(this.pedirDato("Introduce el título del libro: "), this.pedirDato("Introduce el nombre del socio"));
        
    }
}
