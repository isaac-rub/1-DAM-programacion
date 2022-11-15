
import java.util.Scanner;

/*
 */

/**
 *
 * @author usuario-mañana
 */
public class ejer15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String c=("1234");
        System.out.println(" dime la contraseña");
        String con=new Scanner(System.in).nextLine();
        if(c.equals(con))
        {System.out.println("bienvenido");
        } 
        else{System.out.println(" contraseña incorrecta");}
        
        
        
    }
    
}
