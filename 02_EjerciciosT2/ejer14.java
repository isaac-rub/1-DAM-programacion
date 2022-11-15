/*
 */
import java.lang.String;
import java.util.Scanner;
/**
 *
 * @author usuario-mañana
 */
public class ejer14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("Introduce tu frase:");
        String f = new Scanner(System.in).nextLine();
        
        int num = f.length();
        num = (num / 2);
         System.out.println(f.charAt(num));
        
        
        
        
    }
    
}
