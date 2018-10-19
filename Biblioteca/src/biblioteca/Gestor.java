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
public class Gestor
{
    protected String pedirDato(String mensaje)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println(mensaje);
        return teclado.nextLine();
    }
}
