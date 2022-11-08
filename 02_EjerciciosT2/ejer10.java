/*
 */
import bpc.daw.objetos.*;
/**
 *
 * @author usuario-mañana
 */
public class ejer10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caja c1=new Caja("hola mundo");
        c1.abrirCaja();
        System.out.println(c1.getMensaje());
        c1.cambiarMensaje("adios mundo");
        System.out.println(c1.getMensaje());
        
    }
    
}
