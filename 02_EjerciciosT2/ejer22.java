
import bpc.daw.objetos.TarjetaCredito;




/*
 */

/**
 *
 * @author usuario-mañana
 */
public class ejer22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        TarjetaCredito t=null;
        t =new TarjetaCredito(5000,1111);
        System.out.println("este es tu saldo: "+t.getSaldo(1111));
        t.sacarDinero(2000,1111);
        System.out.println("este es tu saldo ahora: "+t.getSaldo(1111));
        
        
        
        
    }
    
}
