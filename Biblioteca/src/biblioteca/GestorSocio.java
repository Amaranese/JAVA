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
public class GestorSocio {
    private Socio[] socios;
    
    public GestorSocio(Socio[] socios){
         this.socios = new Socio[100];
        this.socios = socios;
        
    }

    GestorSocio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void crearSocio(){
        Socio socio = this.introducirSocio();
        this.guardarSocio(socio, this.dimeIndiceDisponible());
    }
    private int dimeIndiceDisponible(){
        for(int i = 0; i <this.socios.length; i++){
            if(this.socios[i] == null){
                return i;
            }
        }
        return -1;
    }
    private void guardarSocio(Socio socio, int indiceDisponible){
        this.socios[indiceDisponible] = socio;
    }
    private String pedirDato(String mensaje){
    Scanner teclado = new Scanner(System.in);
    System.out.println(mensaje);
    return teclado.nextLine();
}
private Socio introducirSocio(){
    return new Socio(this.pedirDato("Introduce tu Nombre"), this.pedirDato("Introduce tu Apellido"), this.pedirDato("Introduce tu DNI"));
    
}
public void mostrarSocio(){
    for(int i = 0; i<this.socios.length; i++){
        if(this.socios[i] !=null){
            System.out.println(this.socios[i].datosSocio());
        }
    }
}
        public void eliminarSocio(){
    this.mostrarSocio();
    this.quitarSocio(this.pedirDato("Introduzca el usuario que desea borrar: "));
        }
        private void quitarSocio(String dni) {
        for (int i = 0; i < this.socios.length; i++) {
            if (this.socios[i] != null && this.socios[i].getSocio().equals(dni)) {
                this.socios[i] = null;
            }
        }
    }
}


        
    
