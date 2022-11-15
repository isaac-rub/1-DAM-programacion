/*
 */
import bpc.daw.objetos.*;
/**
 *
 * @author usuario-mañana
 */
public class ejer12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       MarcadorBaloncesto b1= new MarcadorBaloncesto("Estudiantes","CB Granada");
       b1.anotarCanasta('L', 2);
        b1.anotarCanasta('V', 3);
        b1.anotarCanasta('L', 2);
        b1.anotarCanasta('V', 2);
        b1.anotarCanasta('V', 3);
        b1.anotarCanasta('L', 1);
        b1.anotarCanasta('L', 1);
        b1.anotarCanasta('V', 2);
        
        System.out.println(" equipo local : " + b1.getNombreLocal()  + b1.getPuntosLocal() + " puntos");
        System.out.println(" equipo visitante : " + b1.getNombreVisitante()  + b1.getPuntosVisitante() + " puntos");

        System.out.println("Va ganando: " + b1.getNombreEquipoGanador());
        System.out.println("Va perdiendo: " + b1.getNombreEquipoPerdedor());
        
        
        
        
    }
    
}
