
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;





/**
 *
 * @author usuario-mañana
 */
public class javawors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        
        l.add("abstract" ); 
        l.add("continue");
        l.add("for");
        l.add("new");
        l.add("switch");
        l.add("assert");
        l.add("default");
        l.add("goto");
        l.add("package");
        l.add("synchronized");
        l.add( "boolean");
        l.add("do");
        l.add("if");
        l.add("private");
        l.add( "this");
        l.add("break");
        l.add("double");
        l.add("implements");
        l.add("protected");
        l.add("throw");
        l.add("byte");
        l.add("else");
        l.add("import");
        l.add("public");
        l.add("case");
        l.add("enum");
        l.add("instanceof");
        l.add("return");
        l.add("transient");
        l.add("catch");
        l.add("extends");
        l.add("int");
        l.add("short");
        l.add("try");
        l.add("char");
        l.add("final");
        l.add("interface");
        l.add("static");
        l.add("void");
        l.add("class");
        l.add("finally");
        l.add("long");
        l.add("strictfp");
        l.add("volatile");
        l.add( "const");
        l.add("float");
        l.add("native");
        l.add("super");
        l.add("while");
                      
        boolean repetir=true;
        int contador =0;
        System.out.println("escribe las palabras reserbadas de javaque te sepas"); 
        while(repetir){
        String pa = new Scanner(System.in).nextLine();
      if (l.contains(pa)){contador=contador+1;l.remove(pa);System.out.println("puntuacion:"+contador);
      }else{ System.out.println("esa palabra no es reservada escrive otra"); }
      if (contador==48){repetir=false;System.out.println("as hacertado todas las palabras");}
        } 
      
        
        
        
        
        
        
        
        
        
        
    }

}
