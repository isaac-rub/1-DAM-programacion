
import bpc.daw.objetos.TarjetaCredito;

/*
 */

/**
 *
 * @author usuario-mañana
 */
public class ejer23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
         TarjetaCredito t=null;
        t =new TarjetaCredito(1000,2222);
        System.out.println("este es tu saldo: "+t.getSaldo(2222));
        t.ingresarDinero(100);
        System.out.println("este es tu saldo ahora: "+t.getSaldo(2222));
        t.sacarDinero(2800, 2222);
        try{
             t.getSaldo(2222);}
        catch (Exception e){System.out.println("este es tu saldo ahora: "+t.getSaldo(2222));
        }
        
        
    }
    
}
