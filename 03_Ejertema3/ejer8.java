package unidad3ejer;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author usuario-mañana
 */
public class ejer8 {

   
    public static void main(String[] args) {

        String fra;
        System.out.println("dime una frase");
        fra = new Scanner(System.in).nextLine();

        StringTokenizer st = new StringTokenizer(fra);
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
