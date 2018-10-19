
package appbiblioteca;


public class GestorSocios extends Gestor
{
    private Socio[] socios;
    
    public GestorSocios(Socio[] socios)
    {
        this.socios = new Socio[100];
        this.socios = socios;
    }
    
    public void contratarSocio()
    {
        Socio socio = this.introducirSocio();
        this.guardarSocios(socio, this.dimeIndiceUltimoSocio());
    }
    
    private int dimeIndiceUltimoSocio()
    {
        for (int i = 0; i < socios.length; i++)
        {
            if (this.socios[i] == null)
            {
                return i;
            }
        }
        return -1;
    }
    
    private void guardarSocios(Socio socio, int indiceDisponible)
    {
        this.socios[indiceDisponible] = socio;
    }
    
    private Socio introducirSocio()
    {
        return new Socio(this.pedirDato("Introduce el nombre: ")
                ,this.pedirDato("Introduce el apellido: ")
                ,this.pedirDato("Introduce el id: "));
    }
    
    public Socio getSocio(String nombre)
    {
        Socio socio = new Socio("nombre", "apellido", "id");
        return socio;
    }
    
    public void mostrarSocios()
    {
        for(int i = 0; i < this.socios.length; i++)
        {
            if (this.socios[i] != null)
            {
                System.out.println(this.socios[i].getNombre());
            }
        }
    }
    
    private void quitarSocio(String nombre)
    {
        for (int i = 0; i < this.socios.length; i++)
        {
            if (this.socios[i] != null && this.socios[i].getNombre().equals(nombre))
            {
                this.socios[i] = null;
            }
        }
    }
    
    public void eliminarSocios()
    {
        this.mostrarSocios();
        this.quitarSocio(this.pedirDato("Introduce el nombre: "));
    }
}
