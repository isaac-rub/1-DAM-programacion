
import bpc.daw.mario.*;


/*
 */

/**
 *
 * @author usuario-mañana
 */
public class ejer03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mario m1 =null;
        Luigi l1=null;
        Seta s1=null;
        Cañon c1=null;
        Disparo d1=null;
        Planta p1=null;
        
        m1=new Mario(100,100);
        m1.saltar();
        s1=new Seta(200,300);
        s1.andarHacia(0, 0);
        c1=new Cañon(100,320);
        c1.disparar(200, 200);
        p1=new Planta(400,500);
        p1.comer(true);
      p1=new Planta(450,500);
      p1.comer(true);
     p1=new Planta(500,500);
     p1.comer(true);
     l1=new Luigi(200,200);
     
        
        
        
        
    }
    
}
