
package biblioteca;


public class Biblioteca {
    private Socio[] socios;
    private Libro[] libros;
    private Menu menu;
    private boolean fin;
    
    public Biblioteca(){
        socios = new Socio[100];
        libros = new Libro[100];
        this.fin = false;
        
    }
    public void run(){
        this.menu = new Menu();
        while(!this.fin){
            this.ejecutarSeleccion(this.menu.opcion());
        }
    }
    
    private void salir(){
        this.fin = true;
    }
    
    private void ejecutarSeleccion(int opcion){
       GestorSocio gestorsocio = new GestorSocio(this.socios);
       GestorLibro gestorlibro = new GestorLibro(this.libros);
       switch(opcion){
           case 1:
               
               socios.crearSocio();
               break;
           case 2:
               libros.crearLibro();
               break;
           case 3:
               libros.mostrarLibro();
               break;
           case 4:
               socios.mostrarSocio();
               break;
           case 5:
               socios.eliminarSocio();
               break;
           case 6:
               libros.eliminarLibro();
               break;
           case 7:
               libros.prestarlibro();
               break;
           case 8:
               libros.verprestamo();
               break;
           case 9:
               libros.devolverlibro();
               break;
           
           case 10:
               this.salir();
               System.out.println("¡Hasta Nunca!");
               break;
           default:
               break;
       }
    }
    
}
