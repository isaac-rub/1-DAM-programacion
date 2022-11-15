/*
 */
import java.lang.String;
import java.util.Scanner;
/**
 *
 * @author usuario-mañana
 */
public class ejer13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("dime tu nombre?");
        String nom = new Scanner(System.in).nextLine();
        System.out.println("Tu nombre en mayúsculas: " + nom.toUpperCase());
        System.out.println("Tu nombre en minusculas: " + nom.toLowerCase());
        System.out.println("Total de caracteres : " + nom.length());
        
        
    }
    
}
