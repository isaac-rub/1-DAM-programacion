
import java.util.Scanner;

/*
 */

/**
 *
 * @author usuario-mañana
 */
public class ejer17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" dime tu nombre");
        String nom=new Scanner(System.in).nextLine();
        System.out.println(" dime tu dominio");
        String dom=new Scanner(System.in).nextLine();
        
        if( dom.endsWith(".es") || dom.endsWith(".com")){
           String correo = nom+"@"+dom;
           System.out.println("Tu correo es: "+correo);
       }else{
           System.out.println("El dominio es incorrecto");
       }
    }
    
}
