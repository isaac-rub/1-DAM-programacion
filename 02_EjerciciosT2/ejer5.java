/*
 */
import bpc.daw.mario.*;
/**
 *
 * @author usuario-mañana
 */
public class ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cañon c1=null;
    Disparo d1=null;
    c1=new Cañon(200,200);
    c1.disparar(400,500);
    c1.disparar(40,50);
    System.out.println("cañon 1:"+c1.getTotalDisparosRealizados());
    c1=new Cañon(200,300);   
    c1.disparar(400,500);
    c1.disparar(40,50);
    c1.disparar(4,500);
       System.out.println("cañon 1:"+c1.getTotalDisparosRealizados());
        
    }
    
}
