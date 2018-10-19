/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;
import java.util.Scanner;
/**
 *
 * @author ALUMNOS
 */
public class GestorLibro {
    private Libro[] libros;
    
    public GestorLibro(Libro[] libros){
        this.libros = new Libro[100];
        this.libros = libros;
    }

    GestorLibro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
        
    
    public void crearLibro(){
        Libro libro = this.introducirLibro();
        this.guardarLibro(libro, this.dimeIndiceDisponible());
    }
    private int dimeIndiceDisponible(){
        for(int i = 0; i <this.libros.length; i++){
            if(this.libros[i] == null){
                return i;
            }
        }
        return -1;
    }
    private void guardarLibro(Libro libro, int indiceDisponible){
    this.libros[indiceDisponible] = libro;
}
    private String pedirDato(String mensaje){
    Scanner teclado = new Scanner(System.in);
    System.out.println(mensaje);
    return teclado.nextLine();
    }
    private Libro introducirLibro(){
    return new Libro(this.pedirDato("Introduce el titulo"), this.pedirDato("Introduce el id del Libro"), this.pedirDato("Introduce la Editorial"));
}
    public void mostrarLibro(){
    for(int i = 0; i<this.libros.length; i++){
        if(this.libros[i] !=null){
            System.out.println(this.libros[i].datosLibro());
        }
    }
}
    public void eliminarLibro(){
    this.mostrarLibro();
    this.quitarLibro(this.pedirDato("Introduce el titulo del libro: "));
}
     private void quitarLibro(String id) {
        for (int i = 0; i < this.libros.length; i++) {
            if (this.libros[i] != null && this.libros[i].getLibro().equals(id)) {
                this.libros[i] = null;
            }
        }
     }
     void prestarlibro() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
     void devolverlibro() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void verprestamo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

