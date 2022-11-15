
import java.io.*;
import java.util.Scanner;
import java.lang.String;
/*
 */

/**
 *
 * @author usuario-mañana
 */
public class ejer19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     

        System.out.println("dime la ruta de un archivo");
        String rut = new Scanner(System.in).nextLine();
        
        File ruta = new File(rut);
        
        System.out.println("este archivo tiene : "+ruta.length()+(" bytes"));
        System.out.println("este archivo tiene : "+(ruta.length()*1.0/1024)/1024+(" Megabytes"));
        
        
        
    }

    
}

    