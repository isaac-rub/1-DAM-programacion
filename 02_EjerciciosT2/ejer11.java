/*
 */
import bpc.daw.objetos.*;
/**
 *
 * @author usuario-mañana
 */
public class ejer11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caja c1=null;
        Caja c2=null;
        c1=new Caja("pico y pala");
        c2=new Caja("pico y machete");
        c1.abrirCaja();
        c2.abrirCaja();
         String m1 = c1.getMensaje();
        String m2 = c2.getMensaje();
        System.out.println("caja 1:"+c1.getMensaje());
        System.out.println("caja 2:"+c2.getMensaje());
        
         System.out.println("cambiamos los mensajes");
         c1.cambiarMensaje(m2);
         c2.cambiarMensaje(m1);
          System.out.println("caja 1:"+c1.getMensaje());
        System.out.println("caja 2:"+c2.getMensaje());
         
        
        
        
        
        
        
        
    }
    
}
