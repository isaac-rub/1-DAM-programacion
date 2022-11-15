
import java.io.*;
import java.util.Scanner;

/*
 */

/**
 *
 * @author usuario-mañana
 */
public class ejer20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Escribe la ruta de un archivo");
        String rut = new Scanner(System.in).nextLine();
        
        File ruta = new File(rut);
        
        if (ruta.exists()&& ruta.isDirectory()){
            System.out.println("La ruta corresponde a un directorio");
        }else{
            if(ruta.exists()&& ruta.isFile()){
                System.out.println("La ruta introducida es un archivo,  tamaño: "+ruta.length()+" bytes");
                System.out.println("quieres borrarlo (si/no");
                String validacion = new Scanner(System.in).nextLine();
                if( validacion.equals("si")){
                    ruta.delete();
                    if(ruta.delete()){
                        System.out.println(" no se pudo borrar");
                    }else{
                       System.out.println("Se ha borrado "); 
                    }
                }else{
                    System.out.println("Borrado cancelado");
                }
            }
        }
        
        
        
    }
    
}
