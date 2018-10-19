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
public class Coordenada{
    private int x;
    private int y;
    public Coordenada(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void aumentar(int x, int y){
    this.x = this.x + y;
    this.y = this.y + y;
    }
    private Coordenada quePunto(){
        Coordenada punto = new Coordenada(this.x, this.y);
        return punto;
    }
    public void mostrar(){
        System.out.println("x es " + this.x + "y es " + this.y);
    }
}
    

