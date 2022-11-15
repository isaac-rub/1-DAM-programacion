
import java.util.Scanner;

/*
 */

/**
 *
 * @author usuario-mañana
 */
public class ejer16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" escribe un texto");
        String f1=new Scanner(System.in).nextLine();
        System.out.println(" escribe otro texto");
        String f2=new Scanner(System.in).nextLine();
        
         int numero = f1.indexOf(f2);
       
       if(numero == -1){
           System.out.println("no esta incluido");
       }else{
           System.out.println(" si esta incluido"); 
       }
        
        
        
    }
    
}
