
package appbiblioteca;

import java.util.Scanner;


public class Gestor 
{
    protected String pedirDato(String mensaje)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println(mensaje);
        return teclado.nextLine();
    }
}
