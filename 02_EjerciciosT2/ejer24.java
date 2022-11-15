
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 */

/**
 *
 * @author usuario-mañana
 */
public class ejer24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("dime una frase ");
         String f1=new Scanner(System.in).nextLine();
        System.out.println("dime otra  frase ");
        String f2=new Scanner(System.in).nextLine();
        File f3=new File("C://Users//usuario-mañana//Documents//frase.txt");
        try{
            f3.createNewFile();
         PrintWriter fr=new PrintWriter(f3);
        fr.println(f1);
        fr.println(f2);
        fr.close();
         
        }catch(Exception e){};
        
        
        
    }
    
}
