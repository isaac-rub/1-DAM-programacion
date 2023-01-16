



package unidad3ejer;

/**
 *
 * @author usuario-mañana
 */
public class ejer3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        boolean repetir=true;
        while(repetir){
        int numero = (int)(Math.random()*11);
        System.out.println(numero);
        if(numero==10){repetir=false;};
        
        }
        
    }

}
