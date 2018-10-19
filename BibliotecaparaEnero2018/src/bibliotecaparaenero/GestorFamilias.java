/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaparaenero;

public class GestorFamilias extends Gestor {
    
    private Familia[] familias;
    
    public GestorFamilias(Familia[] familias)
    {
        this.familias = new Familia[100];
        this.familias = familias;
    }
    
    
    public void crearFamilia()
    {
        Familia familia = this.introducirFamilia();
        this.guardarFamilias(familia, this.dimeIndiceUltimoFamilia());
    }
    
    
    private int dimeIndiceUltimoFamilia()
    {
        for (int i = 0; i < familias.length; i++)
        {
            if (this.familias[i] == null)
            {
                return i;
            }
        }
        return -1;
    }
    
    
    private void guardarFamilias(Familia familia, int indiceDisponible)
    {
        this.familias[indiceDisponible] = familia;
    }
    
    
    private Familia introducirFamilia()
    {
        return new Familia(this.pedirDato("Introduce el primer apellido1: ")
                ,this.pedirDato("Introduce el apellido2: ")
                ,this.pedirDato("Introduce el apellido3 : "));
    }
    
    
    public Familia getFamilia(String apellido)
    {
        Familia familia = new Familia("apellido1", "apellido2", "apellido3");
        return familia;
    }
     public void mostrarFamilias()
    {
        for(int i = 0; i < this.familias.length; i++)
        {
            if (this.familias[i] != null)
            {
                System.out.println(this.familias[i].getapellido());
            }
        }
    }
     private void quitarFamilia(String apellido)
    {
        for (int i = 0; i < this.familias.length; i++)
        {
            if (this.familias[i] != null && this.familias[i].getapellido().equals(apellido))
            {
                this.familias[i] = null;
            }
        }
    }
     public void eliminarFamilias()
    {
        this.mostrarFamilias();
        this.quitarFamilia(this.pedirDato("Introduzca el apellido de la familia que desea eliminar : "));
    }
}

