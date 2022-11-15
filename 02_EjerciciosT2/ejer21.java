
import java.io.*;
import java.util.Scanner;

/*
 */

/**
 *
 * @author usuario-mañana
 */
public class ejer21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Escribe la ruta a un directorio");
        String rut = new Scanner(System.in).nextLine();
        
        File ruta = new File(rut);        
        
        if(ruta.isDirectory()){
           File lista[] = ruta.listFiles();  
           System.out.println("Total archivos y carpetas: "+lista.length); 
        }else{
            System.out.println("Error no es un directorio");
             }
        
        
        
        
    }
    
}
