/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author alejandromaranes
 */


   class Libro {
    private String nombre;
    private String id;
    private String editorial;
    
    
    public Libro(String nombre, String id, String editorial){
        this.nombre = nombre;
        this.id = id;
        this.editorial = editorial;
    }

    
        
public String datosLibro(){
    return this.nombre + ' ' + this.id + ' ' + this.editorial;
        
}


    String getLibro(){
        return this.id;
    }
}