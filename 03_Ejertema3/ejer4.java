



package unidad3ejer;

import java.util.Scanner;

/**
 *
 * @author usuario-mañana
 */
public class ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean mayor=true;
        String si = "si";
        String no = "no";
       while(mayor){
        System.out.println("Eres mayor de edad responde si/no");
        String edad=new Scanner(System.in).nextLine();
            
        if(edad.equals(si) )
        {System.out.println("el usuario es mayor de edad"); mayor=false;
        }else{
        if(edad.equals(no)){System.out.println("el usuario  es menor de edad"); mayor=false;
        }else{System.out.println("no entiendo la respuesta");}
        }
        
       }
        
        
        
        
    }

}
