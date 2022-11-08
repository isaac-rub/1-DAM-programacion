/*
 */
import bpc.daw.objetos.*;
/**
 *
 * @author usuario-mañana
 */
public class ejer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DepositoAgua a1=null;    
       a1=new DepositoAgua(15,50);
       int cap=a1.getCantidadActual();
       int max=a1.getCapacidadMaxima();
       int por=(cap*100)/50;
       System.out.println("este es el porcentaje:"+por);
       a1.dibujar();
        
        
        
        
        
    }
    
}
