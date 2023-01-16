package unidad3ejer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author usuario-mañana
 */
public class ejer12 {

    public static void main(String[] args) {
        int notas = 0;
        int sum = 0;     
        boolean llave = true;
        int alum = 0;

        ArrayList n = new ArrayList();
        System.out.println("escribe todas las notas de tu clase con numeros"
                + " enteros y cuando pongas el -1 el programa se acabara");
        while (llave) {
            System.out.println("escribe una nota");
            notas = new Scanner(System.in).nextInt();
            if (notas == -1) {
                llave = false;
            }
            n.add(0, notas);
            sum = sum + notas;
            alum++;
        }
        alum--;
        sum++;
        n.remove(0);
        System.out.println("menor nota:" + Collections.min(n)
                + " mayor nota:" + Collections.max(n) + " nota media:"
                + sum / alum);
    }

}
