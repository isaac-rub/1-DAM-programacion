
import java.util.Scanner;

/*
 */

/**
 *
 * @author usuario-mañana
 */
public class ejer18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" dime tu correo electronico");
        String correo=new Scanner(System.in).nextLine();
        
        int num = correo.indexOf("@");
       String nombre = correo.substring(0,num);
       String dom = correo.substring(num,correo.length());
       
       System.out.println("El nombre es: "+nombre);
       System.out.println("El dominio es: "+dom);
    
        
        
        
    }
    
}
