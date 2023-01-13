package unidad3ejer;

import java.util.Scanner;

/**
 *
 * @author usuario-mañana
 */
public class ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean max = true;
        int caza = 0;
        int cazados = 0;
        System.out.println("piezas que se pueden cazr hoy 25");
        System.out.println("que enpize la caza");
        while (max) {

            System.out.println("introduzca el numero de piezas cazadas");
            cazados = new Scanner(System.in).nextInt();
            caza = caza + cazados;
            System.out.println("lleva " + caza + " de 25 cazas posibles");
            if (caza > 25) {
                System.out.println("as  sobrepasado el  maximo de"
                        + " cazas en este dia. La caza a finalizado ");
                max = false;
            };

        }

    }

}
