/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolabola;

/**
 *
 * @author ALUMNOS
 */
class Pelota {

    private int peso;
    private int tamaño;
    private Coordenada posicion;
    
public Pelota(){
    this.peso=100;
    this.tamaño=10;
    this.posicion = new Coordenada(0, 0 );
            }
public void mover(int x, int y){
    this.posicion.aumentar(x, y );
}
public void dondeEsta(){
    this.posicion.mostrar();
}
    
}
