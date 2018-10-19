/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaparaenero;

public class Familia {
    private String apellido1;
    private String apellido2;
    private String apellido3;

public Familia(String apellido1, String apellido2, String apellido3)
    {
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.apellido3 = apellido3;
    }
    
    public String getFamilia()
    {
        return this.apellido1 + ' ' + this.apellido2 + ' ' + this.apellido3;
    }
    
    public String getapellido()
    {
        return this.apellido1;
    }
}