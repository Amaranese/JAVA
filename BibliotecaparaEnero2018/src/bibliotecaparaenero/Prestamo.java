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
class Prestamo {
    private Libro libros;
    private Socio socios;
    
    public Prestamo(Libro libro, Socio socio){
        this.libros = libro;
        this.socios = socio;
    }
    
    public Socio datosSocio(){
        return this.socios;
    }
    
    public String nombreLibro(){
        return libros.getLibro();
    }
    
    public String nombreSocio(){
        return socios.getNombre();
    }
}
