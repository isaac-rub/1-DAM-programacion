package unidad3ejer;

import java.util.Scanner;

/**
 *
 * @author usuario-mañana
 */
public class ejer9 {

    public static void main(String[] args) {

        double s = 1;
        double a = 1;
        int n;

        System.out.println("dame un numero entero positivo");
        n = new Scanner(System.in).nextInt();
        s = (1 / 2) * (a + n / a);
        System.out.println(s);
        if (s - a <= 0.01) {
            System.out.println("emos terminado");
        } else {
            a = s;
            System.out.println(s - a);
        }
    }

}
