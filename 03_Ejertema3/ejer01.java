



package unidad3ejer;

import java.util.Scanner;

/**
 *
 * @author usuario-mañana
 */
public class ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         String[] canciones = {
           "vista-al-mar.mp3",
           "nada-de-ti.mp3",
           "fernet.mp3",
           "flores.mp3",
           "llena-luna.mp3"
       };
       
       
       System.out.println(" Elige el número de canción para reproducir ");
       System.out.println(" 1 - vista al mar.                     ");
       System.out.println(" 2 - nada de ti.                       ");
       System.out.println(" 3 - fernet.                           ");
       System.out.println(" 4 - flores.                           ");
       System.out.println(" 5 - llena luna.                       ");
    
       
       Scanner cadena = new Scanner(System.in);
       int num = Integer.parseInt(cadena.nextLine());
       
       switch(num){
           case 1:
               System.out.println("Reproduciendo: "+ canciones[0]);
               break;
           case 2:
               System.out.println("Reproduciendo: "+ canciones[1]);
               break;
           case 3:
               System.out.println("Reproduciendo: "+ canciones[2]);
               break;
           case 4:
               System.out.println("Reproduciendo: "+ canciones[3]);
               break;
           case 5:
               System.out.println("Reproduciendo: "+ canciones[4]);
               break;
           default:
                System.out.println("El número elegido NO aparece en la lista.");
       }
        
    }

}
