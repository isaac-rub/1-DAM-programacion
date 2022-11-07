/*
 */
import bpc.daw.objetos.*;
/**
 *
 * @author usuario-mañana
 */
public class ejer8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         DepositoAgua a1,a2=null;    
       a1=new DepositoAgua(15,20);      
        a1.dibujar();    
       a2=new DepositoAgua(5,20);
       a2.dibujar();
        a1.retirarLitro();
        a1.retirarLitro();
        a1.retirarLitro();
        a1.retirarLitro();
        a1.retirarLitro();
        a2.añadirLitro();
        a2.añadirLitro();
        a2.añadirLitro();
        a2.añadirLitro();
        a2.añadirLitro();
        a1.dibujar();
        a2.dibujar();
        
        
    }
    
}
